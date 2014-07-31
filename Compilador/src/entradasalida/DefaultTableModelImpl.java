package entradasalida;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class DefaultTableModelImpl extends DefaultTableModel {

    public DefaultTableModelImpl(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }
    @SuppressWarnings("unchecked")
    public Class[] types;

    @SuppressWarnings("unchecked")
    @Override
    public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
    }
}
