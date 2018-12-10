public class VehicleTypes implements VehicleInterface {

   public String model;
   public int year;
   public String manufacturer;
   public String body;
   public double price;
   public int miles;
   public String carfax;
   
   public VehicleTypes(String model, int year, String manufacturer, String body, double price, int miles, String carfax) {
      this.model = model;
      this.year = year;
      this.manufacturer = manufacturer;
      this.body = body;
      this.price = price;
      this.miles = miles;
      this.carfax = carfax;
   }
   
   public String getModel() {
      return model;
   }
   public int getYear() {
      return year;
   }
   public String getManufacturer() {
      return manufacturer;
   }
   public String getBody() {
      return body;
   }
   public double getPrice() {
      return price;
   }
   public int getMiles() {
      return miles;
   }
   public String getCarfax() {
      return carfax;
   }
   
   public String toString() {
      return String.format("<html>" + "Model: %s<br/>Year: %d<br/>Manufacturer: %s<br/>Body type: %s<br/>Price: $%.2f<br/>Miles: %dk<br/>Carfax: %s" + "<html/>",getModel(),getYear(),getManufacturer(),getBody(),getPrice(),getMiles(),getCarfax());
      }


}


