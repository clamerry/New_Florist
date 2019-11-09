package shopflower;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CLabel;

public class MainApp {

	protected Shell shlFloristShop;
	private Text txtHsdhd;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainApp window = new MainApp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFloristShop.open();
		shlFloristShop.layout();
		while (!shlFloristShop.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFloristShop = new Shell();
		shlFloristShop.setBackground(SWTResourceManager.getColor(0, 204, 255));
		shlFloristShop.setSize(780, 547);
		shlFloristShop.setText("Florist Shop");
		
		Label lblThe = new Label(shlFloristShop, SWT.NONE);
		lblThe.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblThe.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblThe.setFont(SWTResourceManager.getFont("Kaufmann", 38, SWT.NORMAL));
		lblThe.setBounds(10, 28, 82, 63);
		lblThe.setText("The");
		
		Label lblFlorist = new Label(shlFloristShop, SWT.NONE);
		lblFlorist.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblFlorist.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblFlorist.setText("Florist");
		lblFlorist.setFont(SWTResourceManager.getFont("Kaufmann", 38, SWT.NORMAL));
		lblFlorist.setBounds(39, 84, 146, 57);
		
		txtHsdhd = new Text(shlFloristShop, SWT.BORDER);
		txtHsdhd.setText("hsdhd");
		txtHsdhd.setFont(SWTResourceManager.getFont("Roboto", 14, SWT.NORMAL));
		txtHsdhd.setBounds(20, 210, 228, 26);
		
		Label lblNamaPelanggan = new Label(shlFloristShop, SWT.NONE);
		lblNamaPelanggan.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNamaPelanggan.setFont(SWTResourceManager.getFont("Roboto Medium", 17, SWT.NORMAL));
		lblNamaPelanggan.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblNamaPelanggan.setBounds(21, 178, 200, 26);
		lblNamaPelanggan.setText("Nama Pelanggan");
		
		Label lblJenisBunga = new Label(shlFloristShop, SWT.NONE);
		lblJenisBunga.setText("Jenis Bunga");
		lblJenisBunga.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblJenisBunga.setFont(SWTResourceManager.getFont("Roboto Medium", 17, SWT.NORMAL));
		lblJenisBunga.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblJenisBunga.setBounds(21, 248, 200, 26);
		
		Button btnAnggrek = new Button(shlFloristShop, SWT.RADIO);
		btnAnggrek.setFont(SWTResourceManager.getFont("Roboto", 12, SWT.NORMAL));
		btnAnggrek.setBounds(20, 280, 90, 26);
		btnAnggrek.setText("Anggrek");
		
		Button btnLily = new Button(shlFloristShop, SWT.RADIO);
		btnLily.setText("Lily");
		btnLily.setFont(SWTResourceManager.getFont("Roboto", 12, SWT.NORMAL));
		btnLily.setBounds(116, 280, 90, 26);
		
		Button btnMawar = new Button(shlFloristShop, SWT.RADIO);
		btnMawar.setText("Mawar");
		btnMawar.setFont(SWTResourceManager.getFont("Roboto", 12, SWT.NORMAL));
		btnMawar.setBounds(212, 280, 90, 26);
		
		Label lblHargaidr = new Label(shlFloristShop, SWT.NONE);
		lblHargaidr.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblHargaidr.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblHargaidr.setAlignment(SWT.CENTER);
		lblHargaidr.setFont(SWTResourceManager.getFont("Roboto Medium", 15, SWT.NORMAL));
		lblHargaidr.setBounds(20, 337, 115, 26);
		lblHargaidr.setText("Harga (IDR) :");
		
		text = new Text(shlFloristShop, SWT.BORDER);
		text.setText("hsdhd");
		text.setFont(SWTResourceManager.getFont("Roboto", 15, SWT.NORMAL));
		text.setBounds(141, 337, 115, 26);
		
		Label lblTotal = new Label(shlFloristShop, SWT.NONE);
		lblTotal.setText("Total             :");
		lblTotal.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblTotal.setFont(SWTResourceManager.getFont("Roboto Medium", 15, SWT.NORMAL));
		lblTotal.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblTotal.setBounds(20, 380, 115, 26);
		
		text_1 = new Text(shlFloristShop, SWT.BORDER);
		text_1.setText("hsdhd");
		text_1.setFont(SWTResourceManager.getFont("Roboto", 15, SWT.NORMAL));
		text_1.setBounds(141, 380, 115, 26);
		
		Label lblJumlah = new Label(shlFloristShop, SWT.NONE);
		lblJumlah.setText("Jumlah :");
		lblJumlah.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblJumlah.setFont(SWTResourceManager.getFont("Roboto Medium", 15, SWT.NORMAL));
		lblJumlah.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblJumlah.setBounds(273, 337, 115, 26);
		
		text_2 = new Text(shlFloristShop, SWT.BORDER);
		text_2.setText("hsdhd");
		text_2.setFont(SWTResourceManager.getFont("Roboto", 15, SWT.NORMAL));
		text_2.setBounds(355, 337, 115, 26);
		
		Label lblPilihWarnaBucket = new Label(shlFloristShop, SWT.NONE);
		lblPilihWarnaBucket.setText("Pilih Warna Bucket");
		lblPilihWarnaBucket.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblPilihWarnaBucket.setFont(SWTResourceManager.getFont("Roboto Medium", 17, SWT.NORMAL));
		lblPilihWarnaBucket.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblPilihWarnaBucket.setBounds(20, 423, 200, 26);
		
		Button btnCheckButton = new Button(shlFloristShop, SWT.CHECK);
		btnCheckButton.setText("Merah");
		btnCheckButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btnCheckButton.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnCheckButton.setBounds(20, 455, 67, 26);
		
		Button btnBiru = new Button(shlFloristShop, SWT.CHECK);
		btnBiru.setText("Biru");
		btnBiru.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btnBiru.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnBiru.setBounds(93, 455, 67, 26);
		
		Button btnAbuabu = new Button(shlFloristShop, SWT.CHECK);
		btnAbuabu.setText("Abu-Abu");
		btnAbuabu.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btnAbuabu.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnAbuabu.setBounds(166, 455, 82, 26);
		
		Composite composite = new Composite(shlFloristShop, SWT.NONE);
		composite.setBounds(476, 337, 278, 64);

	}
}
