// peogram to fint out compound interest 


class Demo2{


    public static void main(String args[]){
        int  p=10000,t=2;
        double r=5,ci,amt;

        amt = p*Math.pow(1+r/100, t);
        
    
        System.out.println("Amount : "+amt);
        ci = amt-p;
        System.out.printf("Compound Interest : "+ci);
        
        
    }
}