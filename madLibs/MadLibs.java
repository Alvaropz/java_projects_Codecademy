public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Álvaro
    Date: 10/06/2021
    */
        public static void main(String[] args){
        String name1 = "Josefina";
        String adjective1 = "purple";
        String adjective2 = "heavenly";
        String adjective3 = "happy";
        String verb1 = "give up";
        String noun1 = "potatoe";
        String noun2 = "ponies";
        String noun3 = "Uniqlo";
        String noun4 = "chocolate";
        String noun5 = "cups";
        String noun6 = "niño";
        String name2 = "Rodolfino";
        int number = 53;
        String place1 = "Palma de Mallorca";
      
        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
  
        System.out.println(story);
      }       
  }
  