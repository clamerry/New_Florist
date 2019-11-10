package shopflower;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import javax.swing.JOptionPane;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;



public class MainApp {

	protected Shell window;
	private Text text_harga;
	private Text text_total;
	String A = "Anggrek", L = "Lily", M = "Mawar";
	String price_A = "125000", price_L = "135000", price_M = "150000";
	String simpan = "";
	int harga_total;
	private Text text_nama;
	private Text jml;
	String warna;
	

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
		window.open();
		window.layout();
		while (!window.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		window = new Shell();
		window.setBackground(SWTResourceManager.getColor(0, 191, 255));
		window.setSize(780, 547);
		window.setText("Florist");
		window.setLayout(null);
		
		Composite panel_title = new Composite(window, SWT.NONE);
		
		panel_title.setTouchEnabled(true);
		panel_title.setBounds(0, 0, 260, 174);
		panel_title.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Label img_title = new Label(panel_title, SWT.NONE);
		img_title.setImage(SWTResourceManager.getImage(MainApp.class, "/shopflower/title.png"));
		img_title.setAlignment(SWT.CENTER);
		img_title.setBounds(0, 0, 260, 174);
		img_title.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Label label_nama = new Label(window, SWT.NONE);
		label_nama.setBounds(21, 178, 200, 26);
		label_nama.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_nama.setFont(SWTResourceManager.getFont("Roboto Medium", 17, SWT.NORMAL));
		label_nama.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		label_nama.setText("Nama Pelanggan");
		
		text_nama = new Text(window, SWT.BORDER);
		text_nama.setBounds(20, 210, 228, 26);
		text_nama.setFont(SWTResourceManager.getFont("Roboto", 14, SWT.NORMAL));
		
		Label label_jenis = new Label(window, SWT.NONE);
		label_jenis.setBounds(21, 248, 200, 26);
		label_jenis.setText("Jenis Bunga");
		label_jenis.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_jenis.setFont(SWTResourceManager.getFont("Roboto Medium", 17, SWT.NORMAL));
		label_jenis.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Label image = new Label(window, SWT.NONE);
		image.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		image.setAlignment(SWT.CENTER);
		image.setBounds(512, 30, 242, 174);
		
		Button btn_A = new Button(window, SWT.RADIO);
		btn_A.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button source = (Button) e.getSource();
				if(source.getSelection()){
					text_harga.setText(price_A);
					simpan = A;
					image.setImage(SWTResourceManager.getImage(MainApp.class, "/shopflower/Orchid.png"));
				}
			}
		});
			
		btn_A.setBounds(20, 280, 90, 26);
		btn_A.setFont(SWTResourceManager.getFont("Roboto", 12, SWT.NORMAL));
		btn_A.setText("Anggrek");
		btn_A.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Button btn_L = new Button(window, SWT.RADIO);
		btn_L.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button source = (Button) e.getSource();
				if(source.getSelection()){
					text_harga.setText(price_L);
					simpan = L;
					image.setImage(SWTResourceManager.getImage(MainApp.class, "/shopflower/Lily.jpg"));
				}
			}
		});
		btn_L.setBounds(129, 280, 54, 26);
		btn_L.setText("Lily");
		btn_L.setFont(SWTResourceManager.getFont("Roboto", 12, SWT.NORMAL));
		btn_L.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Button btn_M = new Button(window, SWT.RADIO);
		btn_M.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Button source = (Button) e.getSource();
				if(source.getSelection()){
					text_harga.setText(price_M);
					simpan = M;
					image.setImage(SWTResourceManager.getImage(MainApp.class, "/shopflower/Rose.png"));
				}
			}
		});
		btn_M.setBounds(212, 280, 90, 26);
		btn_M.setText("Mawar");
		btn_M.setFont(SWTResourceManager.getFont("Roboto", 12, SWT.NORMAL));
		btn_M.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Label label_harga = new Label(window, SWT.NONE);
		label_harga.setBounds(20, 337, 115, 26);
		label_harga.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_harga.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		label_harga.setAlignment(SWT.CENTER);
		label_harga.setFont(SWTResourceManager.getFont("Roboto Medium", 15, SWT.NORMAL));
		label_harga.setText("Harga (IDR) :");
		
		text_harga = new Text(window, SWT.BORDER);
		text_harga.setEditable(false);
		text_harga.setBounds(141, 337, 115, 26);
		text_harga.setFont(SWTResourceManager.getFont("Roboto", 15, SWT.NORMAL));
		
		Label label_total = new Label(window, SWT.NONE);
		label_total.setBounds(20, 380, 115, 26);
		label_total.setText("Total             :");
		label_total.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_total.setFont(SWTResourceManager.getFont("Roboto Medium", 15, SWT.NORMAL));
		label_total.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		text_total = new Text(window, SWT.BORDER);
		text_total.setEditable(false);
		text_total.setBounds(141, 380, 115, 26);
		text_total.setFont(SWTResourceManager.getFont("Roboto", 15, SWT.NORMAL));
		
		Label label_jumlah = new Label(window, SWT.NONE);
		label_jumlah.setBounds(273, 337, 82, 26);
		label_jumlah.setText("Jumlah :");
		label_jumlah.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_jumlah.setFont(SWTResourceManager.getFont("Roboto Medium", 15, SWT.NORMAL));
		label_jumlah.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Label pilih_warna = new Label(window, SWT.NONE);
		pilih_warna.setBounds(20, 423, 200, 26);
		pilih_warna.setText("Pilih Warna Buket");
		pilih_warna.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		pilih_warna.setFont(SWTResourceManager.getFont("Roboto Medium", 17, SWT.NORMAL));
		pilih_warna.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Button btn_red = new Button(window, SWT.CHECK);
		
		
		btn_red.setBounds(20, 455, 67, 26);
		btn_red.setText("Merah");
		btn_red.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btn_red.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btn_red.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Button btn_blue = new Button(window, SWT.CHECK);
		btn_blue.setBounds(103, 455, 67, 26);
		btn_blue.setText("Biru");
		btn_blue.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btn_blue.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btn_blue.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		
		
		Button btn_gray = new Button(window, SWT.CHECK);
		
		btn_gray.setBounds(176, 455, 84, 26);
		btn_gray.setText("Abu-Abu");
		btn_gray.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btn_gray.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btn_gray.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		Button btn_yellow = new Button(window, SWT.CHECK);
		btn_yellow.setBounds(273, 455, 75, 26);
		btn_yellow.setText("Kuning");
		btn_yellow.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btn_yellow.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btn_yellow.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		
		
		Button btn_orange = new Button(window, SWT.CHECK);
		
		btn_orange.setBounds(362, 455, 75, 26);
		btn_orange.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btn_orange.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btn_orange.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		btn_orange.setText("Oranye");
		
		
		btn_blue.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(btn_blue.getSelection()==true) {
					btn_red.setSelection(false);
					btn_gray.setSelection(false);
					btn_yellow.setSelection(false);
					btn_orange.setSelection(false);
					warna = "Biru";
				}
			}
		});
		
		btn_red.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(btn_red.getSelection()==true) {
					btn_blue.setSelection(false);
					btn_gray.setSelection(false);
					btn_yellow.setSelection(false);
					btn_orange.setSelection(false);
					warna = "Merah";
				}
			}
		});
		btn_gray.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(btn_gray.getSelection()==true) {
					btn_blue.setSelection(false);
					btn_red.setSelection(false);
					btn_yellow.setSelection(false);
					btn_orange.setSelection(false);
					warna = "Abu-Abu";
				}
			}
		});
		btn_yellow.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(btn_yellow.getSelection()==true) {
					btn_blue.setSelection(false);
					btn_red.setSelection(false);
					btn_gray.setSelection(false);
					btn_orange.setSelection(false);
					warna = "Kuning";
				}
			}
		});
		btn_orange.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(btn_orange.getSelection()==true) {
					btn_blue.setSelection(false);
					btn_red.setSelection(false);
					btn_gray.setSelection(false);
					btn_yellow.setSelection(false);
					warna = "Oranye";
				}
			}
		});
		
		
		
		TextViewer textViewer = new TextViewer(window, SWT.BORDER);
		StyledText receipt = textViewer.getTextWidget();
		receipt.setEditable(false);
		receipt.setBounds(512, 219, 242, 230);
		
		Button btn_check = new Button(window, SWT.NONE);
		btn_check.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				receipt.setText(
		                "                              The Florist\n\n"+
		                "   Nama Pemesan   = "+ text_nama.getText() + "\n\n" +
		                "   Jenis Bunga          = "+ simpan +"\n\n"+
		                "   Jumlah                  = "+ jml.getText() + " Buket\n\n"+
		                "   Harga Satuan       = "+ text_harga.getText() +"\n\n"+
		                "   Total                      = " + text_total.getText() +  "\n\n" +
		                "   Warna Buket        =  "+warna+"\n\n" +      
		                "                              Thank you");
			}
		});
		btn_check.setBounds(533, 458, 75, 25);
		
		btn_check.setText("Check");
		
		Button btn_refresh = new Button(window, SWT.NONE);
		btn_refresh.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text_nama.setText("");
		        text_harga.setText("");
		        jml.setText("");
		        text_total.setText("");
		        receipt.setText("");
		        image.setImage(null);
		        btn_A.setSelection(false);
		        btn_L.setSelection(false);
		        btn_M.setSelection(false);
		        btn_red.setSelection(false);
		        btn_blue.setSelection(false);
		        btn_gray.setSelection(false);
		        btn_yellow.setSelection(false);
		        btn_orange.setSelection(false);
		        
			}
		});
		btn_refresh.setBounds(656, 458, 75, 25);
		
		btn_refresh.setText("Refresh");
		
		jml = new Text(window, SWT.BORDER);
		jml.setBounds(364, 337, 31, 26);
		jml.setFont(SWTResourceManager.getFont("Roboto", 15, SWT.NORMAL));
		
	
		
		jml.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

		        int jlh = Integer.parseInt(jml.getText());
		        if (jlh >= 1){
		            
		            int har = Integer.parseInt(text_harga.getText());
		            int totbar = har * jlh;
		            int total = totbar ;
		            
		            text_total.setText(""+total);
		        }else{
		            JOptionPane.showMessageDialog(null, "invalid input", "Error", JOptionPane.ERROR_MESSAGE);

		        }
			}
		}
	);
}
}

