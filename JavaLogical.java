class JavaLogical {

    public static void main(String[] args) {
        int age;
        age=20;
        int weight=60;

        if(age>=10&&age<=30){//かつ　どちらも条件を満たしているなら
            System.out.println("ageは20から30の間です");
        }
        else{
            System.out.println("ageは20～30の間ではありません");
        }

        if(age<10||weight<100){//又は　どちらかが条件を満たすなら
            System.out.println("ageは10未満か、weightが100未満のどちらか、または両方です。");
        }
    }
}
