use std::io;

fn main() {
    let mut nota: f64 = 0.0;
    for _i in 0..4 {
        nota += input_f64("Insira nota:");
    }
    let media: f64 = nota / 4.0;
    if media >= 6.0 {
        println!("APROVADO");
    } else if media >= 3.0 {
        println!("EXAME");
    } else {
        println!("RETIDO");
    }
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
