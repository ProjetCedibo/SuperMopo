import java.util.*;
import javax.swing.*;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableCellRenderer;

public class Fenetre extends javax.swing.JFrame {

  /**
   * Creates new form Fenetre
   */
  public Fenetre()
  {
    try
    {   
      initComponents();
    }
    catch(Exception e){}
  }

  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTable2 = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jScrollPane3 = new javax.swing.JScrollPane();
    jTable3 = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTable4 = new javax.swing.JTable();
    jLabel6 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    buildMenu();

    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Classement");
    jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "Nom", "Classement"
        }
    ));
    jScrollPane2.setViewportView(jTable2);

    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("Palmares");
    jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Nation");
    jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "nation", "nombre de courreurs"
        }
    ));
    jScrollPane1.setViewportView(jTable1);

    jTable3.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
        },
        new String [] {
            "Pays", "Participants"
        }
    ));
    
    jScrollPane3.setViewportView(jTable3);

    jButton1.setText("Precedent");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setText("suivant");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText(" ");

    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText(" ");

    jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {}, new String [] {"Aucune recherche effectue"}
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Recherche");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setText("Rechercher un coureur...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

    pack();
  }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
    {
      if(courant != Integer.MAX_VALUE)
      {
        courant=courant+10;
        if(courant+10>fichiers.get(anne).get(course).getNombreParticipants())
        {
          courant=fichiers.get(anne).get(course).getNombreParticipants()-10;
        }
        createTableauResultat();
      }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {
      if(courant != Integer.MAX_VALUE)
      {
        courant=courant-10;
        if(courant<0)
        {
          courant=0;
        }
        createTableauResultat();
      }
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt)
    {
      ArrayList<Participation> data = Main.getDataOf(evt.getActionCommand());
      String [][] resultats = new String[data.size()][3];
      Iterator<Participation> i = data.iterator();
      Participation temp;
      int iTab=0;

      System.out.print("\nRecherche du courreur \"" + evt.getActionCommand() + "\" " + data.size() + " resultats");
   
      while(i.hasNext())
      {
        temp=i.next();
        resultats[iTab][0]=temp.toString();
        resultats[iTab][1]=temp.getCourse();
        resultats[iTab][2]=String.valueOf(temp.getClassement());
        iTab++;
      }
      
      jTable4.setModel(new javax.swing.table.DefaultTableModel(resultats, new String [] {"Nom", "Course", "Classement"}));
    }

    /**
    * @param args the command line arguments
    */
    static public void demarreFenetre(Hashtable<String, FichierCSV> f) {

    fichiers = f;
    System.out.print("\n\nOuverture fenetre...\n");

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    try
    {
      new Fenetre().setVisible(true);
    }
    catch(Exception e)
    {}
  }

  private void buildMenu()
  {
    menuBar = new  JMenuBar();
    menuAnne = new ArrayList<>();
    JMenu temp;

    MenuActionListener.fichiers = fichiers;
    MenuActionListener.fenetre = this;

    Set<String> s = fichiers.keySet();
    Iterator<String> i = s.iterator();
    String keyTemp;

    while(i.hasNext())
    {
      keyTemp = i.next();
      temp = new JMenu(keyTemp);
      buildMenuItem(temp, keyTemp);
      menuBar.add(temp);
    }

    setJMenuBar(menuBar);
    setVisible(true);
  }

  private void buildMenuItem(JMenu temp, String anne)
  {
    Set<String> s = fichiers.get(anne).getCourse();
    Iterator<String> i = s.iterator();

    while(i.hasNext())
    {
      temp.add(new courseMenuItem(anne, i.next()));
    }
  }

  public void createTableauResultat()
  {
    String [][] resultats = new String[10][2];
    List<Participation> list = fichiers.get(anne).get(course).getSubClassement(courant, courant+10);
    Iterator<Participation> it = list.iterator();
    Participation temp;
 
    for(int i=0;i<10 && it.hasNext();i++)
    {
      temp=it.next();
      resultats[i][0]=temp.toString();
      resultats[i][1]=String.valueOf(temp.getClassement());
    }
    
    jTable2.setModel(new javax.swing.table.DefaultTableModel(resultats, new String [] {"Nom", "Classement"}));
  }

  public void createTableauPalmares()
  {
    Hashtable<String, Participation> palmares = Main.getPalmares(course);
    String [][] resultats = new String[palmares.size()][2];
    Set<String> s = palmares.keySet();
    Iterator<String> i = s.iterator();
    String keyTemp;
    int iTab=0;
 
    while(i.hasNext())
    {
      keyTemp = i.next();
      resultats[iTab][0]=palmares.get(keyTemp).toString();
      resultats[iTab][1]=keyTemp;
      iTab++;
    }
    
    jTable1.setModel(new javax.swing.table.DefaultTableModel(resultats, new String [] {"Nom", "Annee"}));
  }

  public void createTableauNation()
  {
    Hashtable<String, Entier> nation = fichiers.get(anne).get(course).getListeNation();
    Object [][] resultats = new Object[nation.size()][2];
    Set<String> s = nation.keySet();
    Iterator<String> i = s.iterator();
    String keyTemp;
    int iTab=0;

    while(i.hasNext())
    {
      keyTemp = i.next();
      resultats[iTab][0]= createImageIcon("images/"+keyTemp+".gif","");
      resultats[iTab][1]=nation.get(keyTemp).toString();
      iTab++;
    }
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(resultats, new String [] {"Pays", "Participants"}){

            private static final long serialVersionUID = 1L;
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class

            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
    jTable3.setModel(model);
  }

  public void setTempEtNombreParticipant()
  {
    jLabel4.setText("Temp moyen = " + fichiers.get(anne).get(course).getDureeMoyenne());
    jLabel5.setText("Nombre de participants = " + fichiers.get(anne).get(course).getNombreParticipants());
  }

  public void setCourant(int c)
  {
    courant=c;
  }

  public void setAnne(String a)
  {
    anne=a;
  }

  public void setCourse(String c)
  {
    course=c;
  }
  private void setIcon(String file){
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(file)));
  }
  protected ImageIcon createImageIcon(String path,
                                       String description) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL, description);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable jTable2;
  private javax.swing.JTable jTable3;
  private javax.swing.JTable jTable4;
  private javax.swing.JTextField jTextField1;

  private JMenuBar menuBar;
  ArrayList<JMenu> menuAnne;
  static Hashtable<String, FichierCSV> fichiers;

  /**
   * Represente le classement du premier joueur du tableau, permet de savoir ou on en est dans l'affichage.
   * La valeur dinitialisation Integer.MAX_VALUE permet de savoir qu'elle n'a jamais ete modifie et donc que le programme vient
   * de'etre lance
   */
  int courant=Integer.MAX_VALUE;
  String anne;
  String course;
}