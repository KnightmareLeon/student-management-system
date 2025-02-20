package main.app.buttons.changeTable;

import javax.swing.JScrollPane;
import javax.swing.JToggleButton;

import main.app.buttons.add.AddDataButton;
import main.app.buttons.delete.DeleteDataButton;
import main.app.buttons.edit.EditDataButton;
import main.app.input.fields.SearchBar;
import main.app.tables.ManagementTable;
import main.app.tables.tableModels.CSVHandlingTableModel;

public abstract class ChangeToTableButton extends JToggleButton{
    public void changeToTable(JScrollPane sp, CSVHandlingTableModel tm, ManagementTable mTable, 
        AddDataButton[] aDButtons, DeleteDataButton[] dDButtons, EditDataButton[] eDButtons,
        SearchBar searchBar){
        mTable.setModel(tm);
        sp.setViewportView(mTable);
        aDButtons[0].setVisible(true);
        aDButtons[1].setVisible(false);
        aDButtons[2].setVisible(false);

        dDButtons[0].setVisible(true);
        dDButtons[1].setVisible(false);
        dDButtons[2].setVisible(false);
        
        eDButtons[0].setVisible(true);
        eDButtons[1].setVisible(false);
        eDButtons[2].setVisible(false);
        
        searchBar.setText("");
    }
}
