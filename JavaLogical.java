class JavaLogical {

    public static void main(String[] args) {
        int age;
        age=20;
        int weight=60;

        if(age>=10&&age<=30){//���@�ǂ���������𖞂����Ă���Ȃ�
            System.out.println("age��20����30�̊Ԃł�");
        }
        else{
            System.out.println("age��20�`30�̊Ԃł͂���܂���");
        }

        if(age<10||weight<100){//���́@�ǂ��炩�������𖞂����Ȃ�
            System.out.println("age��10�������Aweight��100�����̂ǂ��炩�A�܂��͗����ł��B");
        }
    }
}
