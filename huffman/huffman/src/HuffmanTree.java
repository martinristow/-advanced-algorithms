import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    char data;
    int frequency;
    Node left, right;

    public Node(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }

    public Node(int frequency, Node left, Node right) {
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Node node) {
        return this.frequency - node.frequency;
    }
}

public class HuffmanTree extends JPanel {
    private HashMap<Character, String> huffmanCodes;
    private JTextField textField;
    private JTextArea resultArea;
    private int panelWidth;
    private int panelHeight;

    public HuffmanTree() {
        panelWidth = 1000;
        panelHeight = 800;
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setLayout(new BorderLayout());

        textField = new JTextField();
        JButton encodeButton = new JButton("Encode");

        encodeButton.addActionListener(e -> {
            String inputText = textField.getText();
            if (!inputText.isEmpty()) {
                huffmanCodes = generateHuffmanCodes(inputText);
                resultArea.setText("Huffman Codes:\n");
                for (char c : huffmanCodes.keySet()) {
                    resultArea.append(c + ": " + huffmanCodes.get(c) + "\n");
                }
                repaint();
            } else {
                resultArea.setText("Please enter text to encode.");
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(textField, BorderLayout.CENTER);
        inputPanel.add(encodeButton, BorderLayout.EAST);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (huffmanCodes != null && !huffmanCodes.isEmpty()) {
            int x = panelWidth / 2;
            int y = 50;
            int xOffset = 300;
            int yOffset = 0;
            char rootChar = huffmanCodes.keySet().iterator().next();
            drawTree(g, x, y, xOffset, yOffset, rootChar);
        }
    }

    private void drawTree(Graphics g, int x, int y, int xOffset, int yOffset, char node) {
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 30, 30);
        g.drawString(Character.toString(node), x + 10, y + 20);

        String code = huffmanCodes.get(node);
        if (code != null) {
            g.drawString(code, x + 40, y + 20);
        }

        if (xOffset > 10 && code != null) {
            int xLeft = x - xOffset / 2;
            int xRight = x + xOffset / 2;
            g.drawLine(x + 15, y + 30, xLeft + 15, y + 100);
            g.drawLine(x + 15, y + 30, xRight + 15, y + 100);
            drawTree(g, xLeft, y + 100, xOffset / 2, yOffset + 50, code.charAt(0));
            drawTree(g, xRight, y + 100, xOffset / 2, yOffset + 50, code.charAt(1));
            if (code.length() > 2) {
                drawAdditionalNodes(g, xLeft, y + 100, xOffset / 2, yOffset + 50, code.substring(2));
            }
        }
    }

    private void drawAdditionalNodes(Graphics g, int x, int y, int xOffset, int yOffset, String code) {
        int step = xOffset / (code.length() + 1);
        int xCurrent = x + step;
        for (int i = 0; i < code.length(); i++) {
            g.drawOval(xCurrent, y, 30, 30);
            g.drawString(Character.toString(code.charAt(i)), xCurrent + 10, y + 20);
            if (i < code.length() - 1) {
                g.drawLine(xCurrent + 15, y + 30, xCurrent + step, y + 100);
            }
            xCurrent += step;
        }
    }

    private static HashMap<Character, String> generateHuffmanCodes(String text) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        for (char c : frequencyMap.keySet()) {
            minHeap.offer(new Node(c, frequencyMap.get(c)));
        }

        while (minHeap.size() > 1) {
            Node left = minHeap.poll();
            Node right = minHeap.poll();

            int sumFrequency = left.frequency + right.frequency;
            Node parent = new Node(sumFrequency, left, right);
            minHeap.offer(parent);
        }

        Node root = minHeap.poll();
        HashMap<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(root, "", huffmanCodes);
        return huffmanCodes;
    }

    private static void generateCodes(Node node, String code, HashMap<Character, String> huffmanCodes) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.data, code.isEmpty() ? "0" : code); // Празната низа претставува 0
            return;
        }

        generateCodes(node.left, code + "0", huffmanCodes);
        generateCodes(node.right, code + "1", huffmanCodes);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Huffman Tree");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            HuffmanTree huffmanTreePanel = new HuffmanTree();
            frame.getContentPane().add(huffmanTreePanel);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
