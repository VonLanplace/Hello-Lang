use std::io;

fn main() {
    let mut distancia = input_f64("insira o número de voltas: ");
    distancia *= input_f64("insira a extensão do circuito: ");
    distancia /= input_f64("Insira o tempo percorrido: ");
    distancia *= 3.6;
    println!("A velocidade é {:.2}Km/h", distancia);
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
