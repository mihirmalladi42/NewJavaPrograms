/*
* IF THE PROGRAM DOES NOT ALREADY HAVE A CLASS ASSOCIATED WITH IT, CREATE ONE USING JAVAC NEWSARTICLES.JAVA. THEN RUN THE PROGRAM.
* SET ARGS OR INPUTS TO CNN, NEWYORKTIMES, FOX, BBC, CNNUKRAINEWAR, CNNCOVID19, CNNCORONAVIRUS, NEWYORKTIMESUKRAINEWAR, NEWYORKTIMESCOVID19, 
NEWYORKTIMESCORONAVIRUS, FOXUKRAINEWAR, FOXCOVID19, FOXCORONAVIRUS, BBCUKRAINEWAR, BBCCOVID19, BBCCORONAVIRUS, CORONAVIRUSTRACKER, OR COVID19TRACKER*/
import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
import java.util.Random;
class NewsArticles {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void MoreArticles() {
        boolean response = repeatAgain();
        if (response == true) {
            Scanner what = new Scanner(System.in);
            System.out.println(GREEN + "What do you want to search?" + RESET);
            String ansWhat = what.nextLine();
            if (ansWhat.equalsIgnoreCase("CNN")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.cnn.com/");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ansWhat.equalsIgnoreCase("NewYorkTimes")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsNYT = new URI("https://www.nytimes.com/");
                    desktop.browse(newsNYT);
                  } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ansWhat.equalsIgnoreCase("Fox")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsFox = new URI("https://www.foxnews.com/");
                    desktop.browse(newsFox);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("BBC")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.bbc.com/news");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("CNNUkraineWar")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.cnn.com/specials/europe/ukraine");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("CNNCOVID19") || ansWhat.equalsIgnoreCase("CNNcoronavirus")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.cnn.com/specials/world/coronavirus-outbreak-intl-hnk");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("NewYorkTimesUkraineWar")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.nytimes.com/news-event/ukraine-russia");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("NewYorkTimesCOVID19") || ansWhat.equalsIgnoreCase("newyorktimescoronavirus")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.nytimes.com/news-event/coronavirus");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("FoxUkraineWar")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.foxnews.com/category/world/conflicts/ukraine");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("FoxCOVID19") || ansWhat.equalsIgnoreCase("foxcoronavirus")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.foxnews.com/category/health/infectious-disease/coronavirus");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("BBCUkraineWar")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.bbc.com/news/world-60525350");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("BBCCOVID19") || ansWhat.equalsIgnoreCase("bbccoronavirus")) {
                try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.bbc.com/news/coronavirus");
                    desktop.browse(newsCNN);
                  } catch (Exception e) {
                    e.printStackTrace();
                } 
            } else if (ansWhat.equalsIgnoreCase("CoronavirusTracker") || ansWhat.equalsIgnoreCase("COVID19Tracker")) {
                
                    Random randNum = new Random();
                    int intRandNum = (randNum.nextInt(5)) + 1;
                    if (intRandNum == 1) {
                        try {
                        Desktop desktop = Desktop.getDesktop();
                        URI newsCNN = new URI("https://www.cnn.com/interactive/2020/health/coronavirus-maps-and-cases/");
                        desktop.browse(newsCNN);
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    } else if (intRandNum == 2) {
                        try {
                        Desktop desktop = Desktop.getDesktop();
                        URI newsCNN = new URI("https://www.nytimes.com/interactive/2021/us/covid-cases.html");
                        desktop.browse(newsCNN);
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    } else if (intRandNum == 3) {
                        try {
                        Desktop desktop = Desktop.getDesktop();
                        URI newsCNN = new URI("https://www.foxnews.com/coronavirus-map");
                        desktop.browse(newsCNN);
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    } else if (intRandNum == 4) {
                        try {
                        Desktop desktop = Desktop.getDesktop();
                        URI newsCNN = new URI("https://www.fox13now.com/news/national-news/coronavirus/coronavirus-tracker");
                        desktop.browse(newsCNN);
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    } else if (intRandNum == 5) {
                        try {
                        Desktop desktop = Desktop.getDesktop();
                        URI newsCNN = new URI("https://www.bbc.com/news/world-51235105");
                        desktop.browse(newsCNN);
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                    }
                }
                MoreArticles();
    } else if (response == false) {
        System.out.println(CYAN + "Thank you for checking on the latest news!" + RESET);
    }
    }
    public static boolean repeatAgain() {
        Scanner doAgain = new Scanner(System.in);
        System.out.println(GREEN + "Do you want to look through more news articles? (Yes or No): " + RESET);
        String ans = doAgain.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            return true;
        } else if (ans.equalsIgnoreCase("no")){
            return false;
        } else {
            System.out.println(RED + "Please enter a valid response." + RESET);
            MoreArticles();
            return false;
        }
    }
    public static void main(String[] args) {
        if (args[0].equalsIgnoreCase("CNN")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.cnn.com/");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (args[0].equalsIgnoreCase("NewYorkTimes")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsNYT = new URI("https://www.nytimes.com/");
                desktop.browse(newsNYT);
              } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (args[0].equalsIgnoreCase("Fox")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsFox = new URI("https://www.foxnews.com/");
                desktop.browse(newsFox);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("BBC")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.bbc.com/news");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("CNNUkraineWar")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.cnn.com/specials/europe/ukraine");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("CNNCOVID19") || args[0].equalsIgnoreCase("CNNcoronavirus")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.cnn.com/specials/world/coronavirus-outbreak-intl-hnk");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("NewYorkTimesUkraineWar")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.nytimes.com/news-event/ukraine-russia");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("NewYorkTimesCOVID19") || args[0].equalsIgnoreCase("newyorktimescoronavirus")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.nytimes.com/news-event/coronavirus");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("FoxUkraineWar")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.foxnews.com/category/world/conflicts/ukraine");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("FoxCOVID19") || args[0].equalsIgnoreCase("foxcoronavirus")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.foxnews.com/category/health/infectious-disease/coronavirus");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("BBCUkraineWar")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.bbc.com/news/world-60525350");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("BBCCOVID19") || args[0].equalsIgnoreCase("bbccoronavirus")) {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI newsCNN = new URI("https://www.bbc.com/news/coronavirus");
                desktop.browse(newsCNN);
              } catch (Exception e) {
                e.printStackTrace();
            } 
        } else if (args[0].equalsIgnoreCase("CoronavirusTracker") || args[0].equalsIgnoreCase("COVID19Tracker")) {
            
                Random randNum = new Random();
                int intRandNum = (randNum.nextInt(5)) + 1;
                if (intRandNum == 1) {
                    try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.cnn.com/interactive/2020/health/coronavirus-maps-and-cases/");
                    desktop.browse(newsCNN);
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                } else if (intRandNum == 2) {
                    try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.nytimes.com/interactive/2021/us/covid-cases.html");
                    desktop.browse(newsCNN);
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                } else if (intRandNum == 3) {
                    try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.foxnews.com/coronavirus-map");
                    desktop.browse(newsCNN);
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                } else if (intRandNum == 4) {
                    try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.fox13now.com/news/national-news/coronavirus/coronavirus-tracker");
                    desktop.browse(newsCNN);
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                } else if (intRandNum == 5) {
                    try {
                    Desktop desktop = Desktop.getDesktop();
                    URI newsCNN = new URI("https://www.bbc.com/news/world-51235105");
                    desktop.browse(newsCNN);
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
                }
        }
        MoreArticles();
    }
}
