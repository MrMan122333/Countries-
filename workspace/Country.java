public class Country
{
  // add private instance variables for the name, capital, language, and image file.
  private String country;
  private String capital;
  private String language;
  private String image;
  // add constructors
  public Country(){
    country = "";
    capital = "";
    language = "";
    image="";
  }
  public Country(string cr, string c, string l, string i){
  country = cr;
    capital = c;
    language = l;
    image=i;
  }
  // Write accessor/get methods for each instance variable that returns it.
    public String getCountry(){
      return capital;
    }
     public String getCapital(){
      return capital;
    }
     public String getLanguage(){
      return capital;
    }
     public String getImage(){
      return capital;
    }

  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
      public String toString(){
          return country+"'s capital is "+capital+ " and their language is "+language+".";
      }


  
}