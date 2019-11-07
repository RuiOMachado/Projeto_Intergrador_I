/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.dao;

import java.util.List;
import org.hibernate.Session;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Log;
import projeto.com.negocio.Projeto;

/**
 *
 * @author ruiwa
 */
public class DaoDashboard {

    public static DefaultCategoryDataset buscaProjeto(String projeto) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List result = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            if (projeto != null && projeto != "Selecione"){
                org.hibernate.Query q = sessao.createQuery("from Projeto where upper(descricao) LIKE upper('%" + projeto + "%')");
                result = q.list();
            } else {
                org.hibernate.Query q = sessao.createQuery("From Projeto");
                result = q.list();
            }

            for (Object o : result) {
                Projeto proj = (Projeto) o;
                dataset.addValue(proj.getId(), proj.getDescricao(), proj.getDatainicio());
            }
            sessao.close();
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return dataset;
    }

    public static DefaultCategoryDataset buscaProQuant(String projeto) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List result = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            if (projeto != null && projeto != "Selecione"){
                org.hibernate.Query q = sessao.createQuery("from Projeto where upper(descricao) LIKE upper('%" + projeto + "%')");
                result = q.list();
            } else {
                org.hibernate.Query q = sessao.createQuery("From Projeto");
                result = q.list();
            }

            for (Object o : result) {
                Projeto proj = (Projeto) o;
                dataset.addValue(proj.getId(), proj.getDescricao(), proj.getQntComodo());
            }
            sessao.close();
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return dataset;
    }
    
    public static DefaultPieDataset buscaAmbiente(String projeto) {
        List resultado = null;
        List resultado2 = null;
        DefaultPieDataset dataset = new DefaultPieDataset();

        try {

            Session sessao2 = HibernateUtil.getSessionFactory().openSession();
            sessao2.beginTransaction();

            if (projeto != null && projeto != "Selecione"){
                org.hibernate.Query q2 = sessao2.createQuery(" From Projeto where upper(descricao) Like upper('%" + projeto + "%')");
                resultado2 = q2.list();
            } else {
                org.hibernate.Query q2 = sessao2.createQuery(" From Projeto");
                resultado2 = q2.list();
            }

            sessao2.close();
            for (Object o : resultado2) {
                Projeto pro = (Projeto) o;

                Session sessao = HibernateUtil.getSessionFactory().openSession();
                sessao.beginTransaction();

                org.hibernate.Query q = sessao.createQuery("select count(descricao) as quantidade, id_projeto From Ambiente where id_projeto = " + pro.getId() + " group by id_projeto"); //select count(descricao) as quantidade, id_projeto
                resultado = q.list();

                Object result[] = (Object[]) resultado.get(0);

                Long res1 = (Long) result[0];
                long count = res1.longValue();

                sessao.close();

                dataset.setValue(pro.getNomecliente(), new Integer(Integer.valueOf(count + "")));
            }

        } catch (Exception he) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + he), 0);
        }
        return dataset;
    }
}
