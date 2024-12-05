package PrimeiraProva.AplicacaoSistemaVendas.Controller;

import PrimeiraProva.AplicacaoSistemaVendas.Model.CalculoVenda;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VendasController {
    @GetMapping("")
    public String InfoVenda(Model model){
        model.addAttribute("preco", new CalculoVenda());
        return "Venda";
    }
    @PostMapping("")
    public String ValorFinal(Model model, @ModelAttribute CalculoVenda preco){
        float valorUnitario = preco.getValor();
        float valorTotal = preco.DefineValor();
        double valorDesconto = preco.getDesconto();
        double valorFinal = preco.TotalFinal();

        model.addAttribute("preco", preco);
        model.addAttribute("valorUnitario",valorUnitario);
        model.addAttribute("valorTotal",valorTotal);
        model.addAttribute("valorDesconto",valorDesconto);
        model.addAttribute("valorFinal",valorFinal);
        System.out.println("Valor unitário"+valorUnitario);
        return "Venda";
    }
}
