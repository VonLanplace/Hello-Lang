use std::io;

fn main() {
    let mut celsius: f64;
    loop {
        println!("Insira o temperatura em Celsius:");
        let mut input = String::new();
        io::stdin().read_line(&mut input).expect("Error");
        celsius = match input.trim().parse() {
            Ok(n) => n,
            Err(_) => -300.00,
        };
        let max = 141600000000000000000000000000000000.00;
        if max > celsius && celsius > -273.16 {
            break;
        } else {
            println!("Valor inválido!");
        }
    }
    let fahrenheith = (9.0 * celsius + 160.0) / 5.0;
    println!("O valor em Fahrenheith é {:.2}°", fahrenheith);
    println!("O valor em Kelvin é {:.2}", celsius + 273.00);
}
