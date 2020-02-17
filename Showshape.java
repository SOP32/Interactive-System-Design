import java.awt.*;       
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static javax.swing.GroupLayout.Alignment.*;

@SuppressWarnings("serial")
public class Message extends JFrame {
 
   public static final int width = 350;
   public static final int height = 350;
 
   
   private JTextField t;
   private Font f;
   private int fontstyle = Font.PLAIN;
   private DrawCanvas canvas; 
   private String message ="";
   String[] fontstyleItems = new String[] {"Regular","Italic", "Bold","Bold Italic"};
   String[] fontsizeItems = new String[] {"8","10","12","14","16","18","20","22","24","26","28","30"};
   String[] colorItems = new String[] {"black", "blue", "cyan", "dark gray", "gray", "green", "light gray", "magenta", "orange", "pink", "red", "white", "yellow"};
   private JRadioButton rec, oval, roundrec;
   private Color fgColor = Color.BLACK;
   private Color bgColor = Color.WHITE;
   private int size = 12,X1= 100,Y1 = 100;
   private String shape = "RECT";
   public Message() {
	  JPanel panelContainer = new JPanel(new FlowLayout());
      JPanel panel = new JPanel();
      
      GroupLayout groupLayout = new GroupLayout(panel); 
      DocumentListener dl = new DocumentListener() {

		@Override	
		public void insertUpdate(DocumentEvent e) {
			
			message = t.getText();
			canvas.repaint();
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			
			message = t.getText();
			canvas.repaint();
		
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			
			message = t.getText();
			canvas.repaint();
			
		}
      };
      JLabel label = new JLabel("Message"); 
      t =new JTextField(15);
      t.getDocument().addDocumentListener(dl); 	 
      
      JComboBox<String> fontsizeList = new JComboBox<>(fontsizeItems);
      fontsizeList.setAlignmentX(Component.LEFT_ALIGNMENT);
      fontsizeList.setMaximumSize( fontsizeList.getPreferredSize() );
      
      fontsizeList.addActionListener(new ActionListener() {
    	  
    	    @Override
    	    public void actionPerformed(ActionEvent event) {
    	        JComboBox<String> combo = (JComboBox<String>) event.getSource();
    	        String selectedfontsize = (String) combo.getSelectedItem();
    	 
    	        if (selectedfontsize.equals("8")) {
    	        	size= 8; canvas.repaint();	
    	        }
    	        else if (selectedfontsize.equals("10")) {
    	        	size=10; canvas.repaint();
    	        }else if (selectedfontsize.equals("12")) {
    	        	size=12; canvas.repaint();
    	        }else if (selectedfontsize.equals("14")) {
    	        	size=14; canvas.repaint();
    	        }else if (selectedfontsize.equals("16")) {
    	        	size=16; canvas.repaint();
    	        }
    	        else if (selectedfontsize.equals("18")) {
    	        	size=18; canvas.repaint();
    	        }
    	        else if (selectedfontsize.equals("20")) {
    	        	size=20; canvas.repaint();
    	        }
    	        else if (selectedfontsize.equals("22")) {
    	        	size=22; canvas.repaint();
    	        }
    	        else if (selectedfontsize.equals("24")) {
    	        	size=24; canvas.repaint();
    	        }
    	        else if (selectedfontsize.equals("26")) {
    	        	size=26; canvas.repaint();
    	        }
    	        else if (selectedfontsize.equals("28")) {
    	        	size=28; canvas.repaint();
    	        }
    	        else if (selectedfontsize.equals("30")) {
    	        	size=30; canvas.repaint();
    	        }
    	    }
    	});
      
      JComboBox<String> fontstyleList = new JComboBox<>(fontstyleItems);
      fontstyleList.setAlignmentX(Component.LEFT_ALIGNMENT);
      fontstyleList.setMaximumSize( fontstyleList.getPreferredSize() );
      
      fontstyleList.addActionListener(new ActionListener() {
    	  
    	    @Override
    	    public void actionPerformed(ActionEvent event) {
    	        JComboBox<String> combo = (JComboBox<String>) event.getSource();
    	        String selectedfontstyle = (String) combo.getSelectedItem();
    	 
    	        if (selectedfontstyle.equals("Regular")) {
    	        	fontstyle =Font.PLAIN; canvas.repaint();
    	        } else if (selectedfontstyle.equals("Italic")) {
    	        	fontstyle =Font.ITALIC; canvas.repaint();
    	        }
    	        else if(selectedfontstyle.equals("Bold"))
    	        {fontstyle =Font.BOLD; canvas.repaint(); }
    	        else if(selectedfontstyle.equals("Bold Italic"))
    	        {fontstyle =Font.BOLD+Font.ITALIC; canvas.repaint(); }
    	    }
    	});
      
      JComboBox<String> bgcolorList = new JComboBox<>(colorItems);
      bgcolorList.setSelectedItem("white");
      bgcolorList.setAlignmentX(Component.LEFT_ALIGNMENT);
      bgcolorList.setMaximumSize( bgcolorList.getPreferredSize() );
      
      bgcolorList.addActionListener(new ActionListener() {
    	  
    	    @Override
    	    public void actionPerformed(ActionEvent event) {
    	        JComboBox<String> combo = (JComboBox<String>) event.getSource();
    	        String selectedbgcolor = (String) combo.getSelectedItem();
    	 
    	        if (selectedbgcolor.equals("black")) {
    	        	bgColor =Color.BLACK; canvas.repaint();
    	        } else if (selectedbgcolor.equals("blue")) {
    	        	bgColor =Color.BLUE; canvas.repaint();
    	        }else if (selectedbgcolor.equals("cyan")) {
    	        	bgColor =Color.CYAN; canvas.repaint();
    	        }else if (selectedbgcolor.equals("dark gray")) {
    	        	bgColor =Color.darkGray; canvas.repaint();
    	        }else if (selectedbgcolor.equals("gray")) {
    	        	bgColor =Color.gray; canvas.repaint();
    	        }else if (selectedbgcolor.equals("light gray")) {
    	        	bgColor =Color.lightGray; canvas.repaint();
    	        }else if (selectedbgcolor.equals("green")) {
    	        	bgColor =Color.green; canvas.repaint();
    	        }else if (selectedbgcolor.equals("magenta")) {
    	        	bgColor =Color.magenta; canvas.repaint();
    	        }else if (selectedbgcolor.equals("orange")) {
    	        	bgColor =Color.orange; canvas.repaint();
    	        }else if (selectedbgcolor.equals("pink")) {
    	        	bgColor =Color.pink; canvas.repaint();
    	        }else if (selectedbgcolor.equals("red")) {
    	        	bgColor =Color.red; canvas.repaint();
    	        }else if (selectedbgcolor.equals("white")) {
    	        	bgColor =Color.white; canvas.repaint();
    	        }else if (selectedbgcolor.equals("yellow")) {
    	        	bgColor =Color.yellow; canvas.repaint();
    	        }    	        
    	    }
    	});
      JComboBox<String> fgcolorList = new JComboBox<>(colorItems);
      fgcolorList.setSelectedItem("black");
      fgcolorList.setAlignmentX(Component.LEFT_ALIGNMENT);
      fgcolorList.setMaximumSize( fgcolorList.getPreferredSize() );
      
      fgcolorList.addActionListener(new ActionListener() {
    	  
    	    @Override
    	    public void actionPerformed(ActionEvent event) {
    	        JComboBox<String> combo = (JComboBox<String>) event.getSource();
    	        String selectedfgcolor = (String) combo.getSelectedItem();
    	 
    	        if (selectedfgcolor.equals("black")) {
    	        	fgColor =Color.BLACK; canvas.repaint();
    	        } else if (selectedfgcolor.equals("blue")) {
    	        	fgColor =Color.BLUE; canvas.repaint();
    	        }else if (selectedfgcolor.equals("cyan")) {
    	        	fgColor =Color.CYAN; canvas.repaint();
    	        }else if (selectedfgcolor.equals("dark gray")) {
    	        	fgColor =Color.darkGray; canvas.repaint();
    	        }else if (selectedfgcolor.equals("gray")) {
    	        	fgColor =Color.gray; canvas.repaint();
    	        }else if (selectedfgcolor.equals("light gray")) {
    	        	fgColor =Color.lightGray; canvas.repaint();
    	        }else if (selectedfgcolor.equals("green")) {
    	        	fgColor =Color.green; canvas.repaint();
    	        }else if (selectedfgcolor.equals("magenta")) {
    	        	fgColor =Color.magenta; canvas.repaint();
    	        }else if (selectedfgcolor.equals("orange")) {
    	        	fgColor =Color.orange; canvas.repaint();
    	        }else if (selectedfgcolor.equals("pink")) {
    	        	fgColor =Color.pink; canvas.repaint();
    	        }else if (selectedfgcolor.equals("red")) {
    	        	fgColor =Color.red; canvas.repaint();
    	        }else if (selectedfgcolor.equals("white")) {
    	        	fgColor =Color.white; canvas.repaint();
    	        }else if (selectedfgcolor.equals("yellow")) {
    	        	fgColor =Color.yellow; canvas.repaint();
    	        }    	        
    	    }
    	});
    	      
    	      ButtonGroup group = new ButtonGroup();
    	      rec = new JRadioButton("Rectangle");
    	      group.add(rec);
    	      panel.add(rec);
    	      rec.addActionListener(new ActionListener() {
    	            public void actionPerformed(ActionEvent evt) {
    	            shape ="RECT"; canvas.repaint(); }
    	      });
    	      
    	      oval = new JRadioButton("Oval");
    	      panel.add(oval);
    	      group.add(oval);
    	      oval.addActionListener(new ActionListener() {
    	            public void actionPerformed(ActionEvent evt) {
    	            shape ="OVAL"; canvas.repaint(); }
    	      });
    	      
    	      roundrec = new JRadioButton("RoundedRectangle");
    	      panel.add(roundrec);
    	      group.add(roundrec);
    	      roundrec.addActionListener(new ActionListener() {
    	            public void actionPerformed(ActionEvent evt) {
    	            shape = "ROUNDRECT"; canvas.repaint(); }
    	      });
      
    	      SpinnerModel spinnerModel1 = new SpinnerNumberModel(100,50,500,50);
    	      JLabel shapeWidthLabel = new JLabel("Shape Width"); 
    	      JSpinner shapeWidth = new JSpinner(spinnerModel1);
    	      shapeWidth.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					X1 = (int) spinnerModel1.getValue();
					canvas.repaint();
				}
    	      }); 
    	      
    	      SpinnerModel spinnerModel2 = new SpinnerNumberModel(100,50,500,50);
    	      JLabel shapeHeightLabel = new JLabel("Shape Height");
    	      JSpinner shapeHeight = new JSpinner(spinnerModel2);
    	      shapeHeight.addChangeListener(new ChangeListener() {
				@Override
				public void stateChanged(ChangeEvent e) {
					Y1 = (int) spinnerModel2.getValue();
					canvas.repaint();
				}
    	      }); 

    	      JLabel shapeAttributes = new JLabel("Shape Attributes");
    	      JLabel textAttributes = new JLabel("Text Attributes");
    	      JLabel fontSizeLabel = new JLabel("Font Size");
    	      JLabel fontStyleLabel = new JLabel("Font Style");
    	      JLabel bgColorLabel = new JLabel("Background Color");
    	      JLabel fgColorLabel = new JLabel("Foreground Color");
    	     
    	      
    	      TitledBorder shapeBorder = BorderFactory.createTitledBorder("Shape Attributes");
    	      TitledBorder textBorder = BorderFactory.createTitledBorder("Text Attributes");
    	      
    	      
    	      groupLayout.setAutoCreateGaps(true);
    	      groupLayout.setAutoCreateContainerGaps(true); 
    	     
    	      groupLayout.setHorizontalGroup(
    	    		  groupLayout.createSequentialGroup() 
    	    		  .addGroup(groupLayout.createParallelGroup(LEADING)
    	    				  .addComponent(label)
    	    				  .addComponent(bgColorLabel)
    	    				  .addComponent(fgColorLabel)
    	    				  .addGroup(groupLayout.createParallelGroup(LEADING)
    	    						  .addGroup(groupLayout.createSequentialGroup() 
    	    								  .addComponent(shapeAttributes)
    	    								  )
    	    						  .addComponent(rec) 
    	  	        				  .addComponent(oval) 
    	  	        				  .addComponent(roundrec)
    	  	        				 
    	    						  )

    	    				  .addComponent(textAttributes)
    	    				  .addComponent(fontStyleLabel)
    	    				  .addComponent(fontSizeLabel)
    	    				  
    	    				  )
    	    		  

    	    	        .addGroup(groupLayout.createParallelGroup(LEADING)
    	    	        		.addComponent(t)
    	    	        		.addComponent(bgcolorList)
    	    	        		.addComponent(fgcolorList)
    	    	        		.addGroup(groupLayout.createParallelGroup(TRAILING)
    	    	        				.addGroup(groupLayout.createSequentialGroup() 
    		  	        						.addComponent(shapeHeightLabel)
    		  	        						.addComponent(shapeHeight)
    		  	        						  )
    		  	        				.addGroup(groupLayout.createSequentialGroup() 
    		  	        						.addComponent(shapeWidthLabel)
    		  	        						.addComponent(shapeWidth)
    		  	        						  )
    	    	        				)
    	    	        		
    	        				.addComponent(fontstyleList)
    	        				.addComponent(fontsizeList)
    	        				
    	    	        		)
    	    	        );
    	    	  
    	    	   
    	      
    	      groupLayout.setVerticalGroup(groupLayout.createSequentialGroup() 
    	    		  .addGroup(groupLayout.createParallelGroup(BASELINE) 
    	    		  	.addComponent(label)
    	    		  	.addComponent(t))
    	    		  
    	    		  .addGroup(groupLayout.createParallelGroup(BASELINE)
    	    	    			.addComponent(bgColorLabel)
    	    	    			.addComponent(bgcolorList))
    	    	    			
    	    	    .addGroup(groupLayout.createParallelGroup(BASELINE).addGap(50)
    	    	    			.addComponent(fgColorLabel)
    	    	    			.addComponent(fgcolorList))
  
    	    		  .addGroup(groupLayout.createParallelGroup(BASELINE)
    	    				  .addComponent(shapeAttributes)
    	    				  )
    	    		  .addGroup(groupLayout.createParallelGroup(BASELINE).addGap(100)
    	    				  .addGroup(groupLayout.createSequentialGroup()
    	    	    	    		  .addComponent(rec)
    	    	    	    		  .addComponent(oval) 
    	    	    	    		  .addComponent(roundrec)	  
    	    						  )
    	    				  .addGroup(groupLayout.createSequentialGroup()
    	    						  .addGroup(groupLayout.createParallelGroup(BASELINE)
    	    								  .addComponent(shapeHeightLabel)
    	    								  .addComponent(shapeHeight)
    	    								  )
    	    						  .addGroup(groupLayout.createParallelGroup(BASELINE)
    	    								  .addComponent(shapeWidthLabel)
    	    								  .addComponent(shapeWidth)
    	    								  )
    	  	    	        		)

    	    				  )
    	    		  
    	    		  .addGroup(groupLayout.createParallelGroup(BASELINE)
    	    				  .addComponent(textAttributes)
    	    				  )
    	    		 
    	    		  .addGroup(groupLayout.createParallelGroup(BASELINE)
    	    				  .addComponent(fontStyleLabel)
  	        				.addComponent(fontstyleList))
    	    		  .addGroup(groupLayout.createParallelGroup(BASELINE)
    	    				  .addComponent(fontSizeLabel)
  	        				.addComponent(fontsizeList))
    	    		  
    	      			);
    	      
    	      groupLayout.linkSize(fontsizeList, fontstyleList, bgcolorList, fgcolorList, t);
    	      groupLayout.linkSize(shapeHeight, shapeWidth);
    	      panel.setLayout(groupLayout);
    	      panelContainer.setSize(new Dimension(width, height));
    	      panelContainer.add(panel);
    	    		      		  
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(width, height));
      Container cp = getContentPane();
      
      cp.setLayout(new GridLayout(0,2));
      cp.add(panelContainer);
      cp.add(canvas);
    
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setTitle("Message");
      pack();           
      setVisible(true); 
      requestFocus();   
   }
 
   class DrawCanvas extends JPanel {
      @Override
      public void paintComponent(Graphics g) {
         super.paintComponent(g);
         f = new Font("TimesRoman",fontstyle,size);
         setFont(f);
         setBackground(bgColor);
         g.setColor(fgColor);
         FontMetrics fm = g.getFontMetrics();
		    int x = (getWidth() - fm.stringWidth(message))/2;
		    int y = (getHeight()/2)+ fm.getDescent();
         
         if(shape.equals("OVAL"))
			{
				g.drawOval((getWidth()-X1)/2,(getHeight()-Y1)/2,X1,Y1);
				g.drawString(message, x,y);
			}
			else if(shape.equals("RECT"))
			{
				g.drawRect((getWidth()-X1)/2,(getHeight()-Y1)/2,X1,Y1);
				g.drawString(message, x,y);
			}
			else if(shape.equals("ROUNDRECT"))
			{
				g.drawRoundRect((getWidth()-X1)/2,(getHeight()-Y1)/2,X1,Y1,40,40);
				g.drawString(message, x,y);
			}
			else
			{
				g.drawRect((getWidth()-X1)/2,(getHeight()-Y1)/2,X1,Y1);
				g.drawString(message, x,y);
			}
      if(fm.stringWidth(message) > X1)
      {
    	  message = "Text too long";
    	  f = new Font("TimesRoman",fontstyle,size);
          setFont(f);
      }
      
      }
   }
 
   public static void main(String[] args) {
     
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Message();
            }
      });
   }
}
