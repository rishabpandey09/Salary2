class Salary2 {
    public static void main(String[] args)
    {
        float basic = 25000.0f;
        float DA,HRA,CCA,PF,PT;
        float gross,net;

        DA = 0.7f* basic;
        HRA =0.3F* basic;
        CCA = 240;
        gross = DA+HRA+CCA+basic;
        net = gross - 0.1f* basic - 100;

        System.out.println("Gross = "+gross+" "+net);
    }
}
