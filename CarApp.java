import javax.swing.*;
import javax.swing.SwingUtilities;

import java.awt.*;
import java.awt.event.*;

public class CarApp extends JPanel {
      
   JFrame frame = new JFrame();
   JPanel topPanel = new JPanel();  
   JLabel CarAppTxt = new JLabel("Car App");
   JPanel homePanel = new JPanel();
   JLabel homeBtn = new JLabel(new ImageIcon("res/homeBtn.png"));
   JPanel black = new JPanel();
   JPanel blackF = new JPanel();

   JPanel pageCount = new JPanel();
   CardLayout cL = new CardLayout();
   
   //intro page
   JPanel introPage = new JPanel();
   JLabel introText = new JLabel("<html>"+"Welcome to car app.<br/>This app is designed to make <br/>vehicle browsing an easy and<br/>  friendly experience.<br/> When you are done looking<br/>  at a vehicle, click the home<br/>  button on the bottom<br/> to return to the main screen,<br/> enjoy." + "</html>");
   JLabel continueBtn = new JLabel(new ImageIcon("res/next.png")); 
   
   //First Page Components
   JPanel firstPage = new JPanel();
   JLabel sedanImage = new JLabel(new ImageIcon("res/sedanLogo.png"));
   JLabel sedanText = new JLabel("                   Sedan");
   JLabel SUVimage = new JLabel(new ImageIcon("res/SUVlogo.png"));
   JLabel SUVtext = new JLabel("                      SUV");
   
   //Sedans Page Components
   JPanel sedanPage = new JPanel();
   JLabel nissanImage = new JLabel(new ImageIcon("res/NissanLogo.png"));
   JLabel nissanImageMain = new JLabel(new ImageIcon("res/NissanLogo.png"));
   JLabel nissanText = new JLabel("            Nissan Altima");
   JLabel cadillacImage = new JLabel(new ImageIcon("res/cadilac.png"));
   JLabel cadillacImageMain = new JLabel(new ImageIcon("res/cadilac.png"));
   JLabel cadillacText = new JLabel("            Cadillac CTS");
   JLabel backBtn = new JLabel("8");
   
   //Nissan Page Components
   JPanel nissanPage = new JPanel();
   VehicleTypes v = new VehicleTypes("Altima",2011,"Nissan","Sedan",5900.00,121,"Minor scratches");
   JLabel nissanInfo = new JLabel(v.toString());   
   
   //Cadillac page components
   JPanel cadillacPage = new JPanel();
   VehicleTypes v1 = new VehicleTypes("CTS",2018,"Cadillac","Sedan",7900.00,20,"Good");
   JLabel cadillacInfo = new JLabel(v1.toString());
   
   //SUVpage Components
   JPanel suvPage = new JPanel();
   JLabel toyotaImage = new JLabel(new ImageIcon("res/toyota.png"));
   JLabel toyotaText = new JLabel("Toyota");
   JLabel audiImage = new JLabel(new ImageIcon("res/q7lo.png"));
   JLabel audiText = new JLabel("Audi Q7");
   
   //toyotaPage components
   JPanel toyotaPage = new JPanel();
   JLabel toyotaImageMain = new JLabel(new ImageIcon("res/toyota.png"));
   VehicleTypes t = new VehicleTypes("4Runner",2018,"Toyota","SUV",31831.00,6,"Almost new");
   JLabel toyotaInfo = new JLabel(t.toString());
   
   //audiPage components
   JPanel audiPage = new JPanel();
   JLabel audiImageMain = new JLabel(new ImageIcon("res/q7lo.png"));
   VehicleTypes a = new VehicleTypes("Q7",2016,"Audi","SUV",50831.00,13,"Flat Tire");
   JLabel audiInfo = new JLabel(a.toString());
   
   public CarApp() {
      
      //CardLayout
      pageCount.setLayout(cL);
      pageCount.add(introPage,"intro");
      pageCount.add(firstPage,"home");  
      pageCount.add(sedanPage,"sedan");
      pageCount.add(suvPage,"SUV");
      pageCount.add(nissanPage,"nissan");
      pageCount.add(cadillacPage,"cadillac");
      pageCount.add(toyotaPage,"toyota");
      pageCount.add(audiPage,"audi");
      cL.show(pageCount,"intro");
      
      //introPage
      introPage.add(introText);
      introPage.setBackground(Color.DARK_GRAY);
      introPage.setLayout(new FlowLayout());
      introText.setFont(new Font("Arial",Font.PLAIN,22));
      introText.setForeground(new Color(250,250,250));
      introPage.add(continueBtn);
      
      continueBtn.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"home");
            }     
         });
      
      //JFrame
      frame.add(pageCount, BorderLayout.CENTER);
      frame.setSize(350,600);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      //AppFrame
      frame.add(topPanel, BorderLayout.NORTH);
      topPanel.setBackground(Color.GREEN);
      topPanel.add(CarAppTxt);
      CarAppTxt.setFont(new Font("Delarge", Font.BOLD,16));
      frame.add(black, BorderLayout.EAST);
      black.setBackground(Color.BLACK);
      frame.add(blackF, BorderLayout.WEST);
      blackF.setBackground(Color.BLACK);
      
      //return panel
      frame.add(homePanel, BorderLayout.SOUTH);
      homePanel.add(homeBtn);
      homePanel.setBackground(Color.BLACK);
      
      homeBtn.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"home");
            }     
         });
      
      //FirstPage / SedanLogo   
      firstPage.setLayout(new GridLayout(4,1));
      firstPage.setBackground(Color.DARK_GRAY);
      firstPage.add(sedanImage);
      firstPage.add(sedanText);
      sedanText.setFont(new Font("Delarge",Font.BOLD,22));
      sedanText.setForeground(Color.BLACK);
         
      sedanImage.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"sedan");
            }     
         }); 
         
      sedanText.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"sedan");
            }     
         });   
      
      //FirstPage / SUVlogo
      firstPage.add(SUVimage);
      firstPage.add(SUVtext);
      SUVtext.setFont(new Font("Delarge",Font.BOLD,22));
      SUVtext.setForeground(Color.BLACK);
      
      //SedanPage / NissanLogo
      sedanPage.setLayout(new GridLayout(4,1));
      sedanPage.setBackground(Color.DARK_GRAY);
      sedanPage.add(nissanImage);
      sedanPage.add(nissanText);
      nissanText.setFont(new Font("Delarge",Font.BOLD,22));
      nissanText.setForeground(Color.BLACK);  
      
      nissanImage.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"nissan");
            }     
         });
         
       cadillacImage.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"cadillac");
            }     
         });  
         
      //nissanPage
      nissanPage.setLayout(new FlowLayout());
      nissanPage.add(nissanImageMain);
      nissanPage.setBackground(Color.DARK_GRAY); 
      nissanPage.add(nissanInfo);
      nissanInfo.setForeground(new Color(250,250,250));
      nissanInfo.setFont(new Font("Arial",Font.PLAIN,22));
      
      //SedanPage / Cadillac
      sedanPage.add(cadillacImage);
      sedanPage.add(cadillacText);
      cadillacText.setFont(new Font("Delarge",Font.BOLD,22));
      cadillacText.setForeground(Color.BLACK);
      
      //cadillac page
      cadillacPage.setBackground(Color.DARK_GRAY);
      cadillacPage.setLayout(new FlowLayout());
      cadillacPage.add(cadillacImageMain);
      cadillacPage.add(cadillacInfo);
      cadillacInfo.setFont(new Font("Arial",Font.PLAIN,22));
      cadillacInfo.setForeground(new Color(250,250,250));

      //SUVpage / toyota
      suvPage.setBackground(Color.DARK_GRAY);
      suvPage.add(toyotaImage);
      suvPage.add(toyotaText);
      toyotaText.setFont(new Font("Delarge",Font.BOLD,22));
      toyotaText.setForeground(Color.BLACK);
      
      //SUVpage / Audi Q7
      suvPage.add(audiImage);
      suvPage.add(audiText);
      audiText.setFont(new Font("Delarge",Font.BOLD,22));
      audiText.setForeground(Color.BLACK);
      
      SUVimage.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"SUV");
            }     
         });
         
      SUVtext.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"SUV");
            }     
         });
         
      toyotaImage.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"toyota");
            }     
         });
         
      audiImage.addMouseListener(new MouseListener() {
         public void mouseReleased(MouseEvent e) {}
         public void mouseEntered(MouseEvent e) {}
         public void mousePressed(MouseEvent e) {}
         public void mouseExited(MouseEvent e) {}
         public void mouseClicked(MouseEvent e) {
               cL.show(pageCount,"audi");
            }     
         });   
  
      //toyota page
      toyotaPage.add(toyotaImageMain);
      toyotaPage.setLayout(new FlowLayout());
      toyotaPage.setBackground(Color.DARK_GRAY);
      toyotaPage.add(toyotaInfo);
      toyotaInfo.setFont(new Font("Arial",Font.PLAIN,22));
      toyotaInfo.setForeground(new Color(250,250,250));
      
      //audi page
      audiPage.add(audiImageMain);
      audiPage.setBackground(Color.DARK_GRAY);
      audiPage.add(audiInfo);
      audiInfo.setFont(new Font("Arial",Font.PLAIN,22));
      audiInfo.setForeground(new Color(250,250,250));    
      
   }
    
   public static void main(String[] args) {
            
      new CarApp();            
   
   }

}