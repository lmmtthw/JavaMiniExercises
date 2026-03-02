
void main() {



  // Pencil (child) is a subclass of Item (parent) class.
  class pencil extends Item {

    // The pencil subclass has an additional one field
    public String color;

    public String getColor() {
      return color;
    }

    public void setColor(String newColor) {
      this.color = newColor;
    }

    /* Within the pencil constructor, it inherits the attributes from the parent Item Class.
     * Among those attributes, pencil has its additional class "color".
     * Which is added into the pencil constructor below.
     */
    public pencil(int originalID, String originalName, int originalQuantity, double originalPrice) {
      super(originalID, originalName, originalQuantity, originalPrice);

    }

    /*
     * The toString() method returns the string itself.
     * It is to allow code that is treating the string as a generalized object to know its string value without casting it to type.
     */
    @Override
    public String toString() {
      return "ID:" + getID() + " " + "Name :" + getName() + " Quantity:" + getQuantity() + " Price:" + getPrice() + " Color:" + getColor();
    }

  }

  /*
   * A new type of pencil object is created.
   * I have named the pencil object "penE".
   */
  pencil penE = new pencil(2, "penE", 100, 5.00 );
  System.out.println(penE);

  /*
  Let's assume that I want to change the name of the object "penE"
  From the code below, the setName method was invoked from the parent class "Item".
  The method was invoked to change into a new name.

  If you notice, although the values for the field "originalName" has been set "penK".
  It could be "overwritten" if the method "setName" was invoked.
  This also implies that the complier runs from a top-down approach.
   */
  penE.setName("penC");
  System.out.println(penE);


}
