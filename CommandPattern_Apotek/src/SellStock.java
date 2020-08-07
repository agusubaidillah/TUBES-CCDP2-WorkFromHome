public class SellStock implements Order {
   private Stock obatStock;

   public SellStock(Stock obatStock){
      this.obatStock = obatStock;
   }

   public void execute() {
      obatStock.sell();
   }
}