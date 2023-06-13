package textgame;
import javax.swing.JFrame;

public class janela extends JFrame
	{
		public janela()
		{
			add(new textgame());
			setTitle("Feels");
			JFrame janela = new JFrame();
			janela.setSize(700,700);
			janela.setVisible(true);
		}
		public static void main (String []args)
		{
			new janela();
		}

	}
