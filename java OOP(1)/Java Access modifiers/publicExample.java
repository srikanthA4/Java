public class publicExample{

   public String name = "John";  // public variable

    public void showName() {      // public method
        System.out.println("Name is: " + name);
    }
	public static void main(String[] args){
     publicExample obj = new publicExample();
     obj.showName();
	}
}