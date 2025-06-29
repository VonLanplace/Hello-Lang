use std::io;

fn main() {
    //Valor input
    let valor: f64;
    loop {
        println!("Insira o valor do depósito: ");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Erro read_line");
        valor = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido");
                continue;
            }
        };
        break;
    }
    //Calc
    println!("O valor depois de 1 mês será {:.2}R$.", valor * 1.013);
}
