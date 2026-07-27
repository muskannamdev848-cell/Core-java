package Polymorphism;

public class Main {
    void main() {
       /* Calculator c = new Calculator();
        System.out.println(c.add(2, 4));
        System.out.println(c.add(2, 3, 4));
        System.out.println(c.add(2, 3, 4, 2.5));*/

        //Runtime polymorphism ye apne child ka method draw kar raha he
        Circle c = new Circle();
        //c.draw();
        doDrawingStuff(new Shape());
       // doDrawingStuff(c);

        Rect r = new Rect();
       // r.draw();
        doDrawingStuff(r);

        Shape s = new Shape();
        doDrawingStuff(s);
    }



    public static void doDrawingStuff(Shape s){
     //ye upcasting he child class to parent class ka
        s.draw();
    }
}