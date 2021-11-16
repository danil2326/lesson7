package lesson6;

public class lesson6 {
    public static void main(String[] args) {
        catsBowls();
    }


    private static void catsBowls() {
            cat[] cats = {
                    new cat("Barsik", 50, false),
                    new cat("Murzik", 100, false),
                    new cat("Vaska", 300, false),
                    new cat("Chester", 100, false)
            };

            bowl bowl = new bowl();
            bowl.putFood(500);

        for (int i = 0; i < cats.length; i++) {
          if (cats[i].isSatiety() == false && cats[i].getAppetite() < bowl.getFoodAmount())
          {
              cats[i].eat(bowl);
          }
          else {
              System.out.println("Food is over");
          }
        }
    }
}



