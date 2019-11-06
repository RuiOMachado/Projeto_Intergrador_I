package projeto.com.dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Calculo;
import projeto.com.negocio.ItemMaterial;
import projeto.com.negocio.Log;
import projeto.com.negocio.Radiacao;

/**
 *
 * @author Douglas
 */
public class DaoCalculo {

    public static void listarItemMaterial(JTable jTabela, int idFace, int idCalculo) {
        List resultado = null;

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = sessao.createQuery("from ItemMaterial where idFace = " + idFace + " AND idCalculo = " + idCalculo +"");
            resultado = q.list();

            for (Object o : resultado) {
                ItemMaterial item = (ItemMaterial) o;
                modelo.addRow(new Object[]{
                    item.getId(), item.getIdMaterial().getId(), item.getIdMaterial().getDescricao(), item.getResistencia(), item.getIdMaterial().getFatorsolar()
                });
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
    }

    public static boolean verificarTipoCalculo(int idCalculo) {
        Calculo cal = new Calculo();
        List resultado = null;
        boolean ok = false;
        
            resultado = DaoGenerico.buscaId(idCalculo, "Calculo");

            for (Object o : resultado) {
                cal = (Calculo) o;
            }
            if("Fech. Opaco".equals(cal.getTipo())){
                ok = true;
            }else{
                ok = false;
            }
            return ok;
        
    }
    
    public static int converteCoordenadas(float latitude, String PontosCardeais) {
        String lat = String.valueOf(latitude);
        String valor = lat.substring(1, 3);
        if(valor.charAt(1) == '.'){
            valor = lat.substring(1, 2);
        }
        
        System.out.println(valor);
        int resposta = 0;
        org.hibernate.Query q = null;
        List resultado = null;

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            if (Integer.valueOf(valor) >= 0 && Integer.valueOf(valor) <= 4) {
                int test1 = Integer.valueOf(valor) - 0;
                int test2 = Integer.valueOf(valor) - 4;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 4 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 0 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            } else if (Integer.valueOf(valor) >= 4 && Integer.valueOf(valor) <= 8) {
                int test1 = Integer.valueOf(valor) - 4;
                int test2 = Integer.valueOf(valor) - 8;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 8 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 4 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            } else if (Integer.valueOf(valor) >= 8 && Integer.valueOf(valor) <= 13) {
                int test1 = Integer.valueOf(valor) - 8;
                int test2 = Integer.valueOf(valor) - 13;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 13 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 8 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            } else if (Integer.valueOf(valor) >= 13 && Integer.valueOf(valor) <= 17) {
                int test1 = Integer.valueOf(valor) - 13;
                int test2 = Integer.valueOf(valor) - 17;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 17 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 13 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            } else if (Integer.valueOf(valor) >= 17 && Integer.valueOf(valor) <= 20) {
                int test1 = Integer.valueOf(valor) - 17;
                int test2 = Integer.valueOf(valor) - 20;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 20 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 17 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            } else if (Integer.valueOf(valor) >= 20 && Integer.valueOf(valor) <= 23) {
                int test1 = Integer.valueOf(valor) - 20;
                int test2 = Integer.valueOf(valor) - 23;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 23 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 20 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            } else if (Integer.valueOf(valor) >= 23 && Integer.valueOf(valor) <= 25) {
                int test1 = Integer.valueOf(valor) - 23;
                int test2 = Integer.valueOf(valor) - 25;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 25 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 23 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            } else if (Integer.valueOf(valor) >= 25 && Integer.valueOf(valor) <= 30) {
                int test1 = Integer.valueOf(valor) - 25;
                int test2 = Integer.valueOf(valor) - 30;
                if (test1 >= test2) {
                    q = sessao.createQuery("from Radiacao where latitude = 30 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                } else {
                    q = sessao.createQuery("from Radiacao where latitude = 25 and UPPER(nome) = UPPER('" + PontosCardeais + "')");
                }
            }

            resultado = q.list();

            for (Object o : resultado) {
                Radiacao rad = (Radiacao) o;
                    resposta = rad.getValor();
            }

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return resposta;
    }
    
    public static Calculo getCalculoObj(String idCalculo){
        List resultado = null;
        Calculo calculo = new Calculo();
        int id = Integer.parseInt(idCalculo);
        
        resultado = DaoGenerico.buscaId(id,"Calculo");

        for (Object o : resultado) {
            Calculo cal = (Calculo) o;
            calculo = cal;
        }
        return calculo;
    }
    
    public static Double getSomaQfoQft(String idProjeto, String idAmbiente){
        Object sumQfo = null;
        Object sumQft = null;
        double somaQfo  = 0;
        double somaQft  = 0;
        int idPro = Integer.parseInt(idProjeto);
        int idAmb = Integer.parseInt(idAmbiente);
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
	
            ArrayList<Double> qfo = (ArrayList<Double>) sessao.createSQLQuery("select sum(qfo) from calculo where id_projeto = "+idPro+" or id_ambiente = "+idAmb+"").list();
	    ArrayList<Double> qft = (ArrayList<Double>) sessao.createSQLQuery("select sum(qft) from calculo where id_projeto = "+idPro+" or id_ambiente = "+idAmb+"").list();
		
		sumQfo = qfo.get(0);		
		sumQft = qft.get(0);
	

		somaQfo = (Double) sumQfo;
		somaQft = (Double) sumQft;

        } catch (HibernateException he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return somaQfo + somaQft;
    }
    
    public static String getTipoCalculo(String idCalculo) {
        int id = Integer.parseInt(idCalculo);
        List resultado = null;
        Calculo calculo = new Calculo();

        resultado = DaoGenerico.buscaId(id, "Calculo");

        for (Object o : resultado) {
            Calculo cal = (Calculo) o;
            calculo = cal;
        }
        return calculo.getTipo();
    }
    
    
}
