package animal;

public class Animal {
    private String name; //名前のフィールド
    private int age; //年齢のフィールド
  
    //引数なしのコンストラクタ
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //sayメソッド
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }
    

}
