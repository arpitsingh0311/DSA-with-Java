package M23_OOPS;

public class makeFractionClass {

    public static int gcd(int a, int b){
        int min = Math.min(a,b);
        for(int i=min; i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }

    public static  Fraction add(Fraction a, Fraction b){
        int numerator = a.num*b.den + a.den*b.num;
        int denominator = a.den*b.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return (f3);
    }

    public static  Fraction mul(Fraction a, Fraction b){
        int numerator = a.num+ b.num;
        int denominator = a.den*b.den;
        Fraction f3 = new Fraction(numerator, denominator);
        return (f3);
    }

    public static class Fraction{
        int num;
        int den;
        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(20,25);
        System.out.println(f1.num + "/" + f1.den);
    
        Fraction f2 = new Fraction(7,3);
        System.out.println(f2.num + "/" + f2.den);

        Fraction f3 = add(f1,f2);
        System.out.println(f3.num + "/" + f3.den);

        Fraction f4 = mul(f1,f2);
        System.out.println(f4.num + "/" + f4.den);









    }
}
