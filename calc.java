package polymophism;
class calc{
public int add(int x, int y){
    return x+y;
}

public double add(double a, double b){
    return a+b;
}

public static void main(String[] args ){
    calc add = new add();
    calc addd = new add();
    sout(add.add(1,2));
    sout(add.add(1.2,1.2));

}
}