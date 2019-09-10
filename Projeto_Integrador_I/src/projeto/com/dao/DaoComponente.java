/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.dao;

import com.sun.javafx.css.Combinator;
import java.util.List;
import org.hibernate.Session;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Componente;
import projeto.com.negocio.Log;

/**
 *
 * @author ruiwa
 */
public class DaoComponente {

    public static String buscaComponente(String tela) {
        List resultado1 = null;
        List resultado2 = null;
        int primeiro = 0;
        int ultimo = 0;
        Componente comp = new Componente();
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            org.hibernate.Query q = null;
            org.hibernate.Query r = null;
            System.out.println(tela);
            if (tela.equals("Botão") || tela.equals("Menu") || tela.equals("Menu Item")) {
                q = sessao.createQuery("from Componente where upper(categoria) LIKE upper('%" + tela + "')");
                r = sessao.createQuery("Select max(id) from Componente where upper(categoria) LIKE upper('%" + tela + "')");
            } else if (tela.equals("Tela Material") || tela.equals("Tela Login") || tela.equals("Tela Relatórios") || tela.equals("Tela Permissões")) {
                q = sessao.createQuery("from Componente where upper(descricao) LIKE upper('%" + tela + "')");
                r = sessao.createQuery("Select max(id) from Componente where upper(descricao) LIKE upper('%" + tela + "')");
            }

            q.setMaxResults(1);
            resultado1 = q.list();

            for (Object o : resultado1) {
                comp = (Componente) o;
                primeiro = comp.getId();
                System.out.println("primeiro" + primeiro);
            }
            ultimo = Integer.valueOf("" + r.list().get(0));
            sessao.close();

        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return "" + primeiro + "@" + ultimo;
    }

}
