/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Graficos extends JFrame {
    static ArrayList<Object> estoques = Empacotamento.lerArquivoBinario("dadosEstoques.dat");
    static ArrayList<Object> funcionarios = Empacotamento.lerArquivoBinario("dadosFuncionarios.dat");
    static ArrayList<Object> terrenos = Empacotamento.lerArquivoBinario("dadosTerrenos.dat");
    static ArrayList<Object> plantacoes = Empacotamento.lerArquivoBinario("dados_plantacoes.dat");
    static ArrayList<Object> animais = Empacotamento.lerArquivoBinario("dados_animais.dat");
    
    public static int width = 540;
    public static int heigth = 540;

    
    public static JPanel quantidadeAnimaisSexo() {
        // Contar a quantidade de animais por sexo
        int totalPorcoMacho = 0;
        int totalPorcoFemea = 0;
        int totalGadoMacho = 0;
        int totalGadoFemea = 0;
        int totalGalinhaMacho = 0;
        int totalGalinhaFemea = 0;

        for (Object animal : animais) {
            if (animal instanceof Porco) {
                Porco porco = (Porco) animal;
                if (porco.isSexo()) {
                    totalPorcoMacho++;
                } else {
                    totalPorcoFemea++;
                }
            } else if (animal instanceof Gado) {
                Gado gado = (Gado) animal;
                if (gado.isSexo()) {
                    totalGadoMacho++;
                } else {
                    totalGadoFemea++;
                }
            } else if (animal instanceof Galinha) {
                Galinha galinha = (Galinha) animal;
                if (galinha.isSexo()) {
                    totalGalinhaMacho++;
                } else {
                    totalGalinhaFemea++;
                }
            }
        }

        // Cria o conjunto de dados (dataset)
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(totalPorcoMacho, "Porco", "Machos");
        dataset.addValue(totalPorcoFemea, "Porco", "Fêmeas");
        dataset.addValue(totalGadoMacho, "Gado", "Machos");
        dataset.addValue(totalGadoFemea, "Gado", "Fêmeas");
        dataset.addValue(totalGalinhaMacho, "Galinha", "Machos");
        dataset.addValue(totalGalinhaFemea, "Galinha", "Fêmeas");

        // Cria o gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Quantidade de Animais por Sexo",
                "Sexo",
                "Quantidade",
                dataset
        );

        // Configuração do plot do gráfico
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.GRAY);

        // Configuração do eixo X (categorias)
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelPaint(Color.BLUE);

        // Configuração do renderizador de barras
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);

        // Criação do painel de exibição do gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(width, heigth));

        JPanel panel = new JPanel();
        panel.add(chartPanel);

        // Retorna o painel do gráfico como um JPanel
        return panel;
    }
    
    
    public static JPanel proporcaoAnimaisSexo() {
        // Contar a quantidade de animais de cada tipo e por sexo
        int totalPorcoMacho = 0;
        int totalPorcoFemea = 0;
        int totalGadoMacho = 0;
        int totalGadoFemea = 0;
        int totalGalinhaMacho = 0;
        int totalGalinhaFemea = 0;

        for (Object animal : animais) {
            if (animal instanceof Porco) {
                Porco porco = (Porco) animal;
                if (porco.isSexo()) {
                    totalPorcoMacho++;
                } else {
                    totalPorcoFemea++;
                }
            } else if (animal instanceof Gado) {
                Gado gado = (Gado) animal;
                if (gado.isSexo()) {
                    totalGadoMacho++;
                } else {
                    totalGadoFemea++;
                }
            } else if (animal instanceof Galinha) {
                Galinha galinha = (Galinha) animal;
                if (galinha.isSexo()) {
                    totalGalinhaMacho++;
                } else {
                    totalGalinhaFemea++;
                }
            }
        }

        // Cria o conjunto de dados (dataset)
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(totalPorcoMacho, "Porco", "Macho");
        dataset.addValue(totalPorcoFemea, "Porco", "Fêmea");
        dataset.addValue(totalGadoMacho, "Gado", "Macho");
        dataset.addValue(totalGadoFemea, "Gado", "Fêmea");
        dataset.addValue(totalGalinhaMacho, "Galinha", "Macho");
        dataset.addValue(totalGalinhaFemea, "Galinha", "Fêmea");

        // Cria o gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Proporção de Animais por Sexo",
                "Sexo",
                "Quantidade",
                dataset
        );

        // Cria o painel de gráfico (ChartPanel)
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(width, heigth));

        // Retorna o painel do gráfico como um JPanel
        return chartPanel;
    }
    
    public static JPanel mediaPesoAnimais() {
        // Cria listas para cada tipo de animal
        ArrayList<Gado> gados = new ArrayList<>();
        ArrayList<Galinha> galinhas = new ArrayList<>();
        ArrayList<Porco> porcos = new ArrayList<>();

        // Separa os animais em suas respectivas listas
        for (Object animal : animais) {
            if (animal instanceof Gado) {
                Gado gado = (Gado) animal;
                gados.add(gado);
            } else if (animal instanceof Galinha) {
                Galinha galinha = (Galinha) animal;
                galinhas.add(galinha);
            } else if (animal instanceof Porco) {
                Porco porco = (Porco) animal;
                porcos.add(porco);
            }
        }

        // Calcula a média de peso de cada tipo de animal
        double mediaPesoGado = calcularMediaPeso(gados);
        double mediaPesoGalinha = calcularMediaPeso(galinhas);
        double mediaPesoPorco = calcularMediaPeso(porcos);

        // Cria o conjunto de dados (dataset) para o gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(mediaPesoGado, "Gado", "Média de Peso");
        dataset.addValue(mediaPesoGalinha, "Galinha", "Média de Peso");
        dataset.addValue(mediaPesoPorco, "Porco", "Média de Peso");

        // Cria o gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Média de Peso dos Animais",
                "Tipo de Animal",
                "Peso",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Cria o painel de gráfico (ChartPanel)
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(width, heigth));

        // Retorna o painel do gráfico como um JPanel
        return chartPanel;
    }
    
    // Método para calcular a média de peso de uma lista de animais
    private static double calcularMediaPeso(ArrayList<? extends Animal> animais) {
        double somaPeso = 0;
        for (Animal animal : animais) {
            somaPeso += animal.getPeso();
        }
        return somaPeso / animais.size();
    }

  
    public static JPanel animaisVacinados() {
        // Cria listas para cada tipo de animal
        ArrayList<Gado> gados = new ArrayList<>();
        ArrayList<Galinha> galinhas = new ArrayList<>();
        ArrayList<Porco> porcos = new ArrayList<>();

        // Separa os animais em suas respectivas listas
        for (Object animal : animais) {
            if (animal instanceof Gado) {
                Gado gado = (Gado) animal;
                gados.add(gado);
            } else if (animal instanceof Galinha) {
                Galinha galinha = (Galinha) animal;
                galinhas.add(galinha);
            } else if (animal instanceof Porco) {
                Porco porco = (Porco) animal;
                porcos.add(porco);
            }
        }

        // Calcula o total de cada tipo de animal
        int totalGados = gados.size();
        int totalGalinhas = galinhas.size();
        int totalPorcos = porcos.size();

        // Contadores para animais vacinados por sexo
        int quantBoiVacinado = 0;
        int quantVacaVacinado = 0;
        int quantGalinhaMachoVacinada = 0;
        int quantGalinhaFemeaVacinada = 0;
        int quantPorcoMachoVacinado = 0;
        int quantPorcoFemeaVacinado = 0;

        // Conta a quantidade de animais vacinados por sexo
        for (Gado gado : gados) {
            if (gado.isVacinacao()) {
                if (gado.isSexo()) {
                    quantBoiVacinado++;
                } else {
                    quantVacaVacinado++;
                }
            }
        }

        for (Galinha galinha : galinhas) {
            if (galinha.isVacinacao()) {
                if (galinha.isSexo()) {
                    quantGalinhaMachoVacinada++;
                } else {
                    quantGalinhaFemeaVacinada++;
                }
            }
        }

        for (Porco porco : porcos) {
            if (porco.isVacinacao()) {
                if (porco.isSexo()) {
                    quantPorcoMachoVacinado++;
                } else {
                    quantPorcoFemeaVacinado++;
                }
            }
        }

        // Calcular as porcentagens de animais vacinados por sexo
        double percentGadoMachoVacinado = (double) quantBoiVacinado / totalGados * 100;
        double percentGadoFemeaVacinado = (double) quantVacaVacinado / totalGados * 100;
        double percentGalinhaMachoVacinada = (double) quantGalinhaMachoVacinada / totalGalinhas * 100;
        double percentGalinhaFemeaVacinada = (double) quantGalinhaFemeaVacinada / totalGalinhas * 100;
        double percentPorcoMachoVacinado = (double) quantPorcoMachoVacinado / totalPorcos * 100;
        double percentPorcoFemeaVacinado = (double) quantPorcoFemeaVacinado / totalPorcos * 100;

        // Formatar as porcentagens para exibir duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");

        // Cria o conjunto de dados (dataset) para o gráfico
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(percentGadoMachoVacinado, "Gado", "Macho (" + df.format(percentGadoMachoVacinado) + "%)");
        dataset.addValue(percentGadoFemeaVacinado, "Gado", "Fêmea (" + df.format(percentGadoFemeaVacinado) + "%)");
        dataset.addValue(percentGalinhaMachoVacinada, "Galinha", "Macho (" + df.format(percentGalinhaMachoVacinada) + "%)");
        dataset.addValue(percentGalinhaFemeaVacinada, "Galinha", "Fêmea (" + df.format(percentGalinhaFemeaVacinada) + "%)");
        dataset.addValue(percentPorcoMachoVacinado, "Porco", "Macho (" + df.format(percentPorcoMachoVacinado) + "%)");
        dataset.addValue(percentPorcoFemeaVacinado, "Porco", "Fêmea (" + df.format(percentPorcoFemeaVacinado) + "%)");

        // Cria o gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Porcentagem de animais vacinados por sexo",
                "Sexo",
                "Porcentagem",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Cria o painel de gráfico (ChartPanel)
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(width, heigth));

        // Retorna o painel do gráfico como um JPanel
        return chartPanel;
    }
    
    
    public static JPanel colheitaPlantacao() {
    // Criação do dataset com os dados
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    // Criação de um conjunto para armazenar as culturas únicas
    Set<String> culturas = new HashSet<>();

    // Cálculo da soma da área e quantidade de colheita para cada cultura
    for (Object p : plantacoes) {
        Plantacao plantacao = (Plantacao) p;
        culturas.add(plantacao.getTipoCultura());
    }

    for (String cultura : culturas) {
        double somaArea = 0d;
        double quantColheita = 0;

        for (Object p : plantacoes) {
            Plantacao plantacao = (Plantacao) p;
            if (plantacao.getTipoCultura().equals(cultura)) {
                somaArea += plantacao.getAreaPlantada();
                quantColheita += plantacao.getQuanColheita();
            }
        }

        double porcentagem = (quantColheita / somaArea)*100;
        dataset.addValue(porcentagem, cultura, dataAtual());
    }

    // Criação do gráfico de barras
    JFreeChart chart = ChartFactory.createBarChart(
            "Quantidade colhida",
            "Cultura",
            "Proporção",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
    );

    // Configuração do plot do gráfico
    CategoryPlot plot = chart.getCategoryPlot();
    plot.setBackgroundPaint(Color.WHITE);
    plot.setRangeGridlinePaint(Color.GRAY);

    // Configuração do eixo Y (faixa)
    NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
    rangeAxis.setTickLabelPaint(Color.BLUE);
    rangeAxis.setRange(0, 100); // Define a faixa do eixo vertical de 0 a 100

    // Configuração do renderizador de barras
    BarRenderer renderer = (BarRenderer) plot.getRenderer();
    renderer.setDrawBarOutline(true);

    // Criação do painel de exibição do gráfico
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(width, heigth));

    JPanel panel = new JPanel();
    panel.add(chartPanel);

    return panel;
}
    
    
    
   public static JPanel quimicosPlantacoes(){
        // Criação do dataset com os dados
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Criação de um conjunto para armazenar as culturas únicas
        Set<String> culturas = new HashSet<>();

        // Cálculo da soma da área e quantidade de químicos para cada cultura
        for (Object p : plantacoes) {
            Plantacao plantacao = (Plantacao) p;
            culturas.add(plantacao.getTipoCultura());
        }

        for (String cultura : culturas) {
            double somaArea = 0d;
            double quantQuimico = 0;

            for (Object p : plantacoes) {
                Plantacao plantacao = (Plantacao) p;
                if (plantacao.getTipoCultura().equals(cultura)) {
                    somaArea += plantacao.getAreaPlantada();
                    if (plantacao.isProdutosQuimicos()) {
                        quantQuimico += plantacao.getAreaPlantada();
                    }
                }
            }

            double porcentagem = (quantQuimico / somaArea)*100;
            dataset.addValue(porcentagem, cultura, dataAtual());
        }

        // Criação do gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Uso de produtos químicos",
                "Cultura",
                "Proporção de agrotoxicos",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Configuração do plot do gráfico
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.GRAY);

        // Configuração do eixo Y (faixa)
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelPaint(Color.BLUE);
        rangeAxis.setRange(0, 100); // Define a faixa do eixo vertical de 0 a 100

        // Configuração do renderizador de barras
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);

        // Criação do painel de exibição do gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(width, heigth));

        JPanel panel = new JPanel();
        panel.add(chartPanel);

        return panel;
    }

    public static JPanel terrenoUso(){
        DefaultPieDataset pizza = new DefaultPieDataset();
        double desocupado = 0d;
        for(Object t: terrenos){
            Terreno terreno = (Terreno) t;
            if(terreno.isOcupado()){
                pizza.setValue(Integer.toString(terreno.getId()), terreno.getArea());
            }else{
                desocupado += terreno.getArea();
            }
        }
        pizza.setValue("Desocupados", desocupado);

        JFreeChart grafico = ChartFactory.createPieChart("Quantidade em Estoque", pizza,true,true,false);
        ChartPanel painel = new ChartPanel(grafico);
        return painel;
    }
    
    public static JPanel salarioSetor(){
        // Criação do dataset com os dados
        ArrayList<String> setores = new ArrayList();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        //Cria array com setores da fazenda 
        for (Object f : funcionarios) {
            Funcionario funcionario = (Funcionario) f;
            if(!(setores.contains(funcionario.getSetor()))){
                setores.add(funcionario.getSetor());
            }
        }
        
        for(String s: setores){
            double somaSalarios = 0d;
            int quantSalarios = 0;
            for(Object f:funcionarios){
                Funcionario funcionario = (Funcionario) f;
                if(funcionario.getSetor().equals(s)){
                    somaSalarios += funcionario.getSalario();
                    quantSalarios ++;
                }
            }
            double media = somaSalarios/quantSalarios;
            dataset.addValue(media, s, dataAtual());
        }

        // Criação do gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Média salarial por setor",
                "Setor",
                "Salários (Média)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Configuração do plot do gráfico
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.GRAY);

        // Configuração do eixo Y (faixa)
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelPaint(Color.BLUE);
        //rangeAxis.setRange(0, 100); // Define a faixa do eixo vertical de 0 a 100

        // Configuração do renderizador de barras
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);

        // Criação do painel de exibição do gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(width, heigth));

        JPanel panel = new JPanel();
        panel.add(chartPanel);

        return panel;
    }
    
    
    public static JPanel quantFuncionarioSetor() {
        // Criação do dataset com os dados
        DefaultPieDataset dataset = new DefaultPieDataset();

        // Contagem da quantidade de funcionários por setor
        Map<String, Integer> contagemSetor = new HashMap<>();
        for (Object f : funcionarios) {
            Funcionario funcionario = (Funcionario) f;
            String setor = funcionario.getSetor();
            contagemSetor.put(setor, contagemSetor.getOrDefault(setor, 0) + 1);
        }

        // Adiciona os dados ao dataset
        for (String setor : contagemSetor.keySet()) {
            int quantidade = contagemSetor.get(setor);
            dataset.setValue(setor, quantidade);
        }

        // Criação do gráfico de pizza
        JFreeChart chart = ChartFactory.createPieChart(
                "Quantidade de Funcionários por Setor",
                dataset,
                true,
                true,
                false
        );

        // Configuração do plot do gráfico
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0} ({1})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance()));
        plot.setLegendLabelToolTipGenerator(new StandardPieSectionLabelGenerator("Tooltip: {0}"));

        // Criação do painel de exibição do gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(width, heigth));

        JPanel panel = new JPanel();
        panel.add(chartPanel);

        return panel;
    }
    

    public static JPanel capacidadeEstoques() {
        // Criação do dataset com os dados
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Object e : estoques) {
            Estoque estoque = (Estoque) e;
            double porcentagem = (estoque.getQuantEstocado() / estoque.getTamanhoEstoque()) * 100;
            dataset.addValue(porcentagem, estoque.getTipoProduto(), dataAtual());
        }

        // Criação do gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Taxa de ocupação dos estoques",
                "Estoques",
                "Porcentagem",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Configuração do plot do gráfico
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.GRAY);

        // Configuração do eixo Y (faixa)
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelPaint(Color.BLUE);
        rangeAxis.setRange(0, 100); // Define a faixa do eixo vertical de 0 a 100

        // Configuração do renderizador de barras
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);

        // Criação do painel de exibição do gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(width, heigth));

        JPanel panel = new JPanel();
        panel.add(chartPanel);

        return panel;
    }
    
    public static JPanel quantEstocados(){
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Object e : estoques) {
            Estoque estoque = (Estoque) e;
            dataset.setValue(estoque.getTipoProduto(), estoque.getQuantEstocado());
        }

        JFreeChart chart = ChartFactory.createPieChart("Quantidade em Estoque", dataset, true, true, false);
        PiePlot plot = (PiePlot) chart.getPlot();

        // Personalização do gráfico
        plot.setBackgroundPaint(ChartColor.WHITE);
        plot.setOutlinePaint(null);  // Remove a borda do gráfico
        plot.setLabelBackgroundPaint(new Color(220, 220, 220));  // Define a cor de fundo das etiquetas
        plot.setLabelOutlinePaint(null);  // Remove a borda das etiquetas
        plot.setLabelShadowPaint(null);  // Remove a sombra das etiquetas
        plot.setLabelFont(plot.getLabelFont().deriveFont(Font.BOLD, 12f));  // Define a fonte das etiquetas
        plot.setInteriorGap(0.02);  // Espaçamento interno do gráfico (em relação ao tamanho do painel)

        ChartPanel panel = new ChartPanel(chart);
        panel.setPopupMenu(null);  // Remove o menu de contexto do gráfico

        return panel;
    }
    
    public static JPanel valorEstoques(){
        // Criação do dataset com os dados
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Object e : estoques) {
            Estoque estoque = (Estoque) e;
            double valor = estoque.getQuantEstocado() * estoque.getValorUnidade();
            dataset.addValue(valor, estoque.getTipoProduto(), dataAtual());
        }

        // Criação do gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Valor de todos os itens em estoque",
                "Estoques",
                "Somatório",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Configuração do plot do gráfico
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setRangeGridlinePaint(Color.GRAY);

        // Configuração do eixo Y (faixa)
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelPaint(Color.BLUE);
        //rangeAxis.setRange(0, 100); // Define a faixa do eixo vertical de 0 a 100

        // Configuração do renderizador de barras
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);

        // Criação do painel de exibição do gráfico
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(width, heigth));

        JPanel panel = new JPanel();
        panel.add(chartPanel);

        return panel;
    }
    
     public static String dataAtual(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	String data = dateFormat.format(Calendar.getInstance().getTime());
        return data;
    }
     
    public static void main(String[] args) {
        new Graficos();
        
    }
    
}
