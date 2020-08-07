public class BuyStock implements Order {
   private Stock obatStock;

   public BuyStock(Stock obatStock){
      this.obatStock = obatStock;
   }

   public void execute() {
      obatStock.buy();
   }
}