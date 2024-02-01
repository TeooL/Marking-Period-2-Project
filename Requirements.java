/**
 * This is the requirements class used to fulfill the rest of my requirements for the project
 */
public class Requirements {
    private int times_called = 0;
    private int used_two = 0;
    private Enemy test_dummy;
    int [] numbers = new int[]{1,2,3,4,0};
    int [] nums = new int[5];

    /**
     *
     * @param e (must be one of the 8 enemies from the enemy class)
     */
    public Requirements(Enemy e){
        test_dummy = e;
    }
    public void makeEnemy(){
        test_dummy = new Enemy("Test", 10,20);
    }
    public void use(){
        times_called++;
        System.out.println("This has been used");
        System.out.println("use has been used " + times_called + " times");
        use_two();
    }
    private void use_two(){
        used_two += 2;
    }

    /**
     *
     * @return 0 if it exists in the number array or 1 if not
     */
    public int return_loop(){
        for (int i = 0;i < numbers.length; i++){
            if (numbers[i] == 0) {
                return numbers[i];
            }
        }
        return 1;
    }
    public int returnMax(int[] ints){
        int max = ints[0];
        for (int i : ints){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public Enemy getTest_dummy(){
        return test_dummy;
    }
    public String toString(){
       return "This is test dummy";
    }
}
