
/**
 * Zachary Yan; CS1A Spring 2017; Foothill College; Elaine Wright; 
 * 
 * My comments: Tests class StreetAddress by creating two objects of class StreetAddress,
 * sets the values in them, and prints out the two objects.
 */
/*//remove this
class TestStreetAddress {
   public static void main(String args[])  {
      StreetAddress foothill;
      foothill = new StreetAddress();
      foothill.setHouse("12345 El Monte Road");
      foothill.setCity("Los Altos Hills");
      foothill.setState("CA");
      foothill.setZip("94022");
      foothill.setCountry("USA");
      System.out.println(foothill.toString());

      StreetAddress deanza;
      deanza = new StreetAddress();
      deanza.setHouse("21250 Stevens Creek Blvd.");
      deanza.setCity("Cupertino");
      deanza.setState("CA");
      deanza.setZip("95014");
      deanza.setCountry("USA");
      System.out.println(deanza.toString());
   }
}

/**
 * Output:
 * 
 * 12345 El Monte Road
 * Los Altos Hills CA 94022 
 * USA
 * 
 * 21250 Stevens Creek Blvd.
 * Cupertino CA 95014 
 * USA
*/
