import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class ComboBoxFrame extends JFrame
{
    private JComboBox imagesJComboBox;
    private JLabel label;
    
    private static final String[] names =
    { "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif" };
    private Icon[] icons = {
        new ImageIcon( getClass().getResource( names[0])),
        new ImageIcon( getClass().getResource( names[1])),
        new ImageIcon( getClass().getResource( names[2])),
        new ImageIcon( getClass().getResource( names[3])) };
    
    
    public ComboBoxFrame()
    {
        super("Testing JComboBox");
        setLayout( new FlowLayout());
        
        imagesjComboBox = new JcomboBox(names);
        imagesJcomboBox.setMaximumRowCount(3);
        
        imagesJComboBox.addItemListener(
                new ItemListener()
                {
                    
                    public void itemStageChanged( ItemEvent event )
                    {
                        
                        if (event.getStateChange() == ItemEvent.SELECTED )
                            label.setIcon( icons [
                                    imagesJComboBox.getSelectedIndex()]);
                }
    }
        );
        
add (imagesJComboBox);
label = new jLabel(icons[0]);
add( label );
    }
}
