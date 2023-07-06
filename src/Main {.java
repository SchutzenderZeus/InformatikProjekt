class Main {
    static Chat chat=new Chat();
    public static void main(String args[]){
        chat.addSatz("Hallo Welt!");
        chat.addSatz("Hallo");
        chat.addSatz("42");

        System.out.println(chat.zufaellig());
    }
}
