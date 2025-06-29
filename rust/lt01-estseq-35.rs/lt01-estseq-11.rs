use std::io;

fn main() {
    //input raio
    let raio: f64;
    loop {
        println!("Insira o raio da Circunferência: ");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error read_line!");
        raio = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => {
                println!("Valor inválido!");
                continue;
            }
        };
        break;
    }
    println!(
        "A circunferência é {:.2}.",
        2.0 * std::f64::consts::PI * raio
    );
}
