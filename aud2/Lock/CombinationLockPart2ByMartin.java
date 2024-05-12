package aud2.Lock;

public class CombinationLockPart2ByMartin {

    private static int combination;
    private static boolean isOpen;
    private static int DEFAULT_COMBINATION=16;

    public CombinationLockPart2ByMartin(int combination){
        this.isOpen=false;
        if(validCombination(combination))
            this.combination=combination;
        else this.combination=DEFAULT_COMBINATION;
    }
    public boolean validCombination(int combination){
        return combination>=10 && combination<=30;
    }
    public boolean isLock(){
        return this.isOpen=false;
    }
    public boolean itsOpen(int combination){
        this.isOpen=(this.combination==combination);
        return this.isOpen;
    }
    public boolean changeCombination(int oldCombination,int newCombination)
    {
        if(itsOpen(oldCombination)&&validCombination(combination)) {
            this.combination = newCombination;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        CombinationLockPart2ByMartin objekt=new CombinationLockPart2ByMartin(20);
        System.out.println(objekt.isLock());
        System.out.println(objekt.itsOpen(20));
        System.out.println(objekt.itsOpen(15));
        System.out.println(objekt.itsOpen(16));
        System.out.println(objekt.changeCombination(20,19));
        System.out.println(objekt.itsOpen(16));
        System.out.println(objekt.itsOpen(19));
    }

}
