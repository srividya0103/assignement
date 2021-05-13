package p2;

public class Runner {
	public static void main(String[] args) {
      MySmartClass<Integer> intClass = new MySmartClass<>();
      intClass.doAddData(10);
      intClass.doAddData(40);
      intClass.doAddData(55);
     MySmartClass<Dog> dogClass = new MySmartClass<>();
     dogClass.doAddData(new Dog());

}
}