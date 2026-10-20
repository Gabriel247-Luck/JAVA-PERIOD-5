class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
    System.out.println(imageType("filename"));
    
    String courseCode = "MKUFT E";

    if (courseCode.substring(5,6).equals("E") || courseCode.substring(5,6).equals("M"))
      System.out.println("College credit");
    else
      System.out.println("Not college credit");
      
      String officialClass = "B";
      String letter = officialClass.substring(0,1);
      
    if (letter.equals("B"))
      System.out.println("Berrouet");
    else if (letter.equals("C"))
      System.out.println("Chu");
    else if (letter.equals("D"))
      System.out.println("Dinn");
    else if (letter.equals("E"))
      System.out.println("Eyzengart");
    else if (letter.equals("F"))
      System.out.println("Flores");
    else if (letter.equals("G"))
      System.out.println("Gibson");
    else if (letter.equals("L"))
      System.out.println("Shim Lee");
    else if (letter.equals("M"))
      System.out.println("Meltzer");
    else if (letter.equals("P"))
      System.out.println("Paccione");
    else if (letter.equals("S"))
      System.out.println("Fiore");
    else if (letter.equals("T"))
      System.out.println("Tsai");
    else if (letter.equals("Z"))
      System.out.println("Zayes");
    else
      System.out.println("Counselor not found");

  }

  String imageType(String fileName) {
    
    String txt = fileName.substring(fileName.length() - 3);

    if (txt.equalsIgnoreCase("JPG"))
      return "Joint Photographic Experts Group";
    else if (txt.equalsIgnoreCase("PEG"))
      return "Joint Photographic Experts Group";
    else if (txt.equalsIgnoreCase("PNG"))
      return "Portable Network Graphics";
    else if (txt.equalsIgnoreCase("GIF"))
      return "Graphics Interchange Format";
    else if (txt.equalsIgnoreCase("PDF"))
      return "Portable Document Format";
    else
      return "Unknown file type";
  }
}


