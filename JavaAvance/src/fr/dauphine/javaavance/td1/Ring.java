package fr.dauphine.javaavance.td1;

public class Ring {
	private Point centre;
    private int ra_out;
    private int ra_in;

    public Ring(Point p, int n1, int n2) {
        this.centre = p;
        if (n1 > n2) {
            this.ra_in = n2;
            this.ra_out = n1;
        } else {
            this.ra_in = n1;
            this.ra_out = n2;
        }
    }

    public boolean equals(Ring r) {
        return this.ra_out == r.ra_out && this.ra_in == r.ra_in;
    }

    public String toString() {
        return "L'anneau est de centre :" + this.centre + " , de rayon interne " + this.ra_in + " et de rayon externe : " + this.ra_out;
    }

    public boolean contains(Point p) {
        if (p == null) return false;
        if (p.isSameAs(this.centre)) return true;
        int dist_p_centre = (int) Math.sqrt(((p.getX() - this.centre.getX()) * (p.getX() - this.centre.getX())) +
                ((p.getY() - this.centre.getY()) * (p.getY() - this.centre.getY())));
        return dist_p_centre <= this.ra_out && dist_p_centre >= this.ra_in;
    }

	

}
