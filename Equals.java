class Cat {
    String name;
    int sleepHr;

    Cat(String name, int sleepHr) {
        this.name = name;
        this.sleepHr = sleepHr;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Cat other = (Cat) obj;
        return this.sleepHr== other.sleepHr;
    }
}
public class Equals {
    public static void main(String[] args) {
        Cat c1 = new Cat("Zuii", 10);
        Cat c2 = new Cat("Zuii", 11);
        Cat c3 = new Cat("Charl", 11);

        System.out.println("c1 equals c2? " + c1.equals(c2));  
        System.out.println("c2 equals c3? " + c2.equals(c3)); 
        System.out.println("c3 equals c1? " + c3.equals(c1)); 
    }
}
