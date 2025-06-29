fn main() {
    let mut soma = 0.0;
    for i in 1..=15 {
        let aux = i as f64;
        soma += aux / (aux * aux);
    }
    println!("O valor da série é {:.3}.", soma);
}
