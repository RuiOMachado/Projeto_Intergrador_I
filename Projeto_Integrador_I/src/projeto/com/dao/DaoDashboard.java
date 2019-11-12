/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.com.dao;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import projeto.com.apresentacao.NewLogin;
import projeto.com.config.HibernateUtil;
import projeto.com.negocio.Ambiente;
import projeto.com.negocio.Calculo;
import projeto.com.negocio.Log;
import projeto.com.negocio.Projeto;

/**
 *
 * @author ruiwa
 */
public class DaoDashboard {

    public static DefaultCategoryDataset buscaProjeto(String projeto) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<Object> list = null;
        Iterator iterator = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            if (projeto != null && projeto != "Selecione") {
                org.hibernate.Query q = sessao.createQuery("select amb.descricao ,proj.descricao, sum(cal.qfo) From Projeto as proj, Calculo as cal, Ambiente as amb where upper(proj.descricao) Like upper('%" + projeto + "%') and proj.id = cal.idProjeto and amb.id = cal.idAmbiente group by amb.descricao,proj.descricao");//from Projeto where upper(descricao) LIKE upper('%" + projeto + "%')");
                list = q.list();
                iterator = list.iterator();
            } else {
                org.hibernate.Query q = sessao.createQuery("select amb.descricao ,proj.descricao, sum(cal.qfo) From Projeto as proj, Calculo as cal, Ambiente as amb where proj.id = cal.idProjeto and amb.id = cal.idAmbiente group by amb.descricao,proj.descricao");
                list = q.list();
                iterator = list.iterator();
            }

            while (iterator.hasNext()) {
                Object[] obj = (Object[]) iterator.next();

                double valor1 = Double.valueOf(obj[2].toString());
                String valor2 = obj[0].toString();
                String valor3 = obj[1].toString();

                dataset.addValue(valor1, valor2, valor3);
            }

            sessao.close();
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return dataset;
    }

    public static DefaultPieDataset buscaProQuant(String projeto) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        List<Object> result = null;
        Iterator iterator = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            if (projeto != null && projeto != "Selecione") {
                org.hibernate.Query q = sessao.createQuery("Select proj.descricao, count(amb.id_projeto) from Ambiente as amb , Projeto as proj where amb.id_projeto = proj.id and upper(proj.descricao) LIKE upper('%" + projeto + "%') group by proj.descricao");
                result = q.list();
                iterator = result.iterator();
            } else {
                org.hibernate.Query q = sessao.createQuery("Select proj.descricao, count(amb.id_projeto) from Ambiente as amb , Projeto as proj where amb.id_projeto = proj.id group by proj.descricao");
                result = q.list();
                iterator = result.iterator();
            }
            while (iterator.hasNext()) {
                Object[] obj = (Object[]) iterator.next();

                int valor1 = Integer.valueOf(obj[1].toString());
                String valor2 = obj[0].toString();

                dataset.setValue(valor2 + " - " + valor1, valor1);
            }

            sessao.close();
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return dataset;
    }

    public static DefaultCategoryDataset buscaFace(String projeto) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<Object> list = null;
        Iterator iterator = null;
        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            if (projeto != null && projeto != "Selecione") {
                org.hibernate.Query q = sessao.createQuery("Select face.nome, count(iM.idMaterial) from ItemMaterial as iM, Face as face, Ambiente as amb, Projeto as proj where face.id = iM.idFace and face.id_ambiente = amb.id and amb.id_projeto = proj.id and upper(proj.descricao) Like upper('%" + projeto + "%') group by face.nome");
                list = q.list();
                iterator = list.iterator();
            } else {
                org.hibernate.Query q = sessao.createQuery("Select face.nome, count(iM.idMaterial) from ItemMaterial as iM, Face as face where face.id = iM.idFace group by face.nome");
                list = q.list();
                iterator = list.iterator();
            }

            while (iterator.hasNext()) {
                Object[] obj = (Object[]) iterator.next();

                double valor1 = Double.valueOf(obj[1].toString());
                String valor2 = obj[0].toString();

                dataset.addValue(valor1, valor2, valor2);
            }

            sessao.close();
        } catch (Exception ex) {
            DaoLog.saveLog(new Log(NewLogin.usuarioLogado.getNome(), "Erro :" + ex), 0);
        }
        return dataset;
    }
}
