use std::io;

fn main() {
    let mut valor = input_f64("Insira a quantidade de horas trabalhadas: ");
    valor *= input_f64("Insira o valor por Hora: ");
    valor *= 1.0 - (input_f64("Insira o percentual de desconto: ") / 100.0);
    valor += 100.0 * input_f64("Insira o numero de dependentes: ");
    println!("O valor do salário a receber é {:.2}R$.", valor);
}

fn input_f64(texto: &str) -> f64 {
    let double: f64;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        double = match input.trim().parse() {
            Ok(n) => {
                if n >= 0.0 {
                    n
                } else {
                    println!("Valor inválido!");
                    continue;
                }
            }
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        return double;
    }
}
