/Java For-each loop example which prints the  
//elements of the array  
public class ForEachExample {  
    public enum Day { Mon, Tues, Wed, Thurs, Fri, Sat, Sun }
    public static void main(String[] args) {
	 //Declaring an array  
	 //int arr[]={12,23,44,56,78};
	 //Printing array using for-each loop
	 //for(int i:arr) {
	 //	 System.out.println(i);

        Day dayNow[] = Day.values();

	for (Day i : dayNow) {
		System.out.println(i);
	} 	 
    }  
}  
