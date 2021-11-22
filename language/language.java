class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;
  
    Language(String name, int numSpeakers, String regionSpoken, String wordOrder) {
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionSpoken = regionSpoken;
      this.wordOrder = wordOrder;
    }
  
    public void getInfo(){
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ". The language follows the word order: " + this.wordOrder + ".");
    }
  
    public static void main(String[] args) {
      Language spanish = new Language("Spansih", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
      spanish.getInfo();
      Mayan chorti = new Mayan("Chʼortiʼ", 2000);
      chorti.getInfo();
      SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 800000000);
      SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
      mandarin.getInfo();
      burmese.getInfo();
    }
  }