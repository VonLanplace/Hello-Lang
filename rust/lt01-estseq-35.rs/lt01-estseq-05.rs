use std::io;

fn main() {
    let mut a: f64;
    let mut b: f64;
    let mut c: f64;
    //loop raizes reais
    loop {
        //input ax^2
        loop {
            println!("Insira o valor de ax^2: ");
            let mut input = String::new();
            io::stdin().read_line(&mut input).expect("Error read_line!");
            a = match input.trim().parse() {
                Ok(n) => n,
                Err(_) => {
                    println!("Valor inválido!");
                    continue;
                }
            };
            if a != 0.0 {
                break;
            }
        }
        //input bx
        loop {
            println!("Insira o valor de bx: ");
            let mut input = String::new();
            io::stdin().read_line(&mut input).expect("Error read_line!");
            b = match input.trim().parse() {
                Ok(n) => n,
                Err(_) => {
                    println!("Valor inválido!");
                    continue;
                }
            };
            break;
        }
        //input C
        loop {
            println!("Insira o valor de c: ");
            let mut input = String::new();
            io::stdin().read_line(&mut input).expect("Error read_line!");
            c = match input.trim().parse() {
                Ok(n) => n,
                Err(_) => {
                    println!("Valor inválido!");
                    continue;
                }
            };
            break;
        }
        //Tete de 2 raizes
        if (b * b - (4.0 * a * c)) > 0.0 {
            break;
        }
        println!("O valor de delta não é maior que 0!");
    }
    let delta = b * b - (4.0 * a * c);
    println!("A primeira raiz é {:.2}.", (-b + delta.sqrt()) / (2.0 * a));
    println!("A segunda raiz é {:.2}.", (-b - delta.sqrt()) / (2.0 * a));
}
