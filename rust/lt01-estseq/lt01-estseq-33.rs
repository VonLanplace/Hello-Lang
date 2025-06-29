use std::io;

fn main() {
    let num = input_f64("Insira um número: ");
    println!("O valor da série com {:.0} termos é {:.2}", num, serie(num));
}

fn serie(mut num: f64) -> f64 {
    let mut serie = 0.0;
    while num > 0.0 {
        serie += 1.0 / num;
        num -= 1.0;
    }
    return serie;
}

fn input_f64(texto: &str) -> f64 {
    let int: f64;
    loop {
        println!("{}", texto);
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line");
        int = match input.trim().parse() {
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
        return int;
    }
}
