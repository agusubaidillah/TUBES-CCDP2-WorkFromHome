public class CommandPatternDemo {
   public static void main(String[] args) {
      Stock obatStock = new Stock();

      BuyStock buyStockOrder = new BuyStock(obatStock);
      SellStock sellStockOrder = new SellStock(obatStock);

      Apoteker apoteker = new Apoteker();
      apoteker.takeOrder(buyStockOrder);
      apoteker.takeOrder(sellStockOrder);

      apoteker.placeOrders();
   }
}