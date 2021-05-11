package nz.wicker.autoencoder.visualization

trait Observer[-X] {
  def notify(x: X, important: Boolean): Unit
}