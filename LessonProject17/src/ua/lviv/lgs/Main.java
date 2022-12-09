package ua.lviv.lgs;

public class Main {

public static void main(String[] args) {
        
        
        Number [] array = {5, -226, 12, -151, 10, 41, -56, 3, 0, 77, 88};
        System.out.println("Array of " + array.length + " elements:" );
        for (int i = 0; i < array.length; i++) {
            Number number = array[i];
            System.out.println(number);
        }
        
        Collection collection = new Collection(array);
        Iterator iteratorFirst = collection.createFirst();
        System.out.println("\nResult of the first task:");
        while (iteratorFirst.hasNext()) {
            System.out.println(iteratorFirst.next());
            
        }
 
        Iterator iteratorSecond = collection.createSecond();
        System.out.println("\nResult of the second task:");
        while (iteratorSecond.hasNext()) {
            System.out.println(iteratorSecond.next());
            
        }
 
        Iterator iteratorThird = collection.createAnonymousIterator();
        System.out.println("\nResult of the third task:");
        while (iteratorThird.hasNext()) {
            Number next = iteratorThird.next();
            if(next!=null) 
            System.out.println(next);
            
        }
 
        Iterator iteratorFourth = collection.createLocalIterator();
        System.out.println("\nResult of the fourth task:");
        while (iteratorFourth.hasNext()) {
            Number next = iteratorFourth.next();
            System.out.println(next);
            
        }
 
        Iterator iteratorFifth = Collection.createFifth();
        System.out.println("\nResult of the fifth task:");
        while (iteratorFifth.hasNext()) {
            Number next = iteratorFifth.next();
            if (next !=null)
            System.out.println(next);
            
        }
      
        
        
    }

}